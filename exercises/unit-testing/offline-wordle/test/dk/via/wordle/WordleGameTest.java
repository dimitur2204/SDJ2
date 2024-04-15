package dk.via.wordle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.rmi.RemoteException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordleGameTest {
    private WordleGame game;

    @BeforeEach
    void setUp() throws RemoteException {
        // Replace the words with the words you want. randomWord() always returns "Word1" in this setup.
        Dictionary dictionary = new FakeRandomDictionary("Word1", "Word2", "Word3", "3N0$g", "0Ng3T", "N0g3$");
        game = new WordleGame(5, dictionary);
    }

    @Test
    void guess_with_a_longer_word_throws_an_exception() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.guess("TooLong");
        });
    }

    @Test
    void guess_with_a_shorter_word_throws_an_exception() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.guess("26rt");
        });
    }

    @Test
    void guess_with_an_unknown_word_throws_an_exception() {
        assertThrows(UnknownWordException.class, () -> {
            game.guess("Word4");
        });
    }

    @Test
    void guess_with_no_right_letters_returns_miss_results() throws RemoteException {
        List<Result> result = game.guess("Word1");
        for (Result r : result) {
            assertEquals(r, Result.MISS);
        }
    }

    @Test
    void guess_with_misplaced_letter_returns_wrong_place_results() throws RemoteException {
        List<Result> result = game.guess("3N0$g");
        for (Result r : result) {
            assertEquals(r, Result.WRONG_PLACE);
        }
    }

    @Test
    void guess_with_all_correct_letters_returns_correct_results() throws RemoteException {
        List<Result> result = game.guess("N0g3$");
        for (Result r : result) {
            assertEquals(r, Result.CORRECT);
        }
    }

    @Test
    void guess_with_mix_of_correct_and_incorrect_letters_returns_results() throws RemoteException {
        List<Result> result = game.guess("0Ng3T");
        assertEquals(result.get(0), Result.WRONG_PLACE);
        assertEquals(result.get(1), Result.WRONG_PLACE);
        assertEquals(result.get(2), Result.CORRECT);
        assertEquals(result.get(3), Result.CORRECT);
        assertEquals(result.get(4), Result.MISS);
    }
}
