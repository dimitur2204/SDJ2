package dk.via.wordle;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class FakeRandomDictionary implements Dictionary {
    private final HashSet<String> words;
    private final ArrayList<String> wordsArr;

    public FakeRandomDictionary(String... words) {
        this.words = new HashSet<>(Arrays.asList(words));
        this.wordsArr = new ArrayList<>(Arrays.asList(words));
    }

    @Override
    public String randomWord(int length) throws RemoteException {
        return wordsArr.get(wordsArr.size() - 1);
    }

    @Override
    public boolean lookup(String word) {
        return words.contains(word);
    }
}
