package threads.synclist;

public class ListRunner implements Runnable{
   private ListContainer list;
   public ListRunner(ListContainer list){
      this.list = list;
   }
    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            this.list.add(i);
        }
        System.out.println(list.getLength());
    }
}
