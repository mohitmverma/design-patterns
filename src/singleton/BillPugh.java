package singleton;

public class BillPugh {

    //private BillPugh instance;

    private static class BillPughHelper {
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance() {
        return BillPughHelper.instance;
    }

}
