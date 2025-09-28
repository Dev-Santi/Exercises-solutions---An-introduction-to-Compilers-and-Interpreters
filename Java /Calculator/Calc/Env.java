public static class Env {
    public HashMap<String, FunType> signature ;
    public LinkedList<HashMap<String,Type>> contexts ;

    public static Type lookupVar(String id) {};
    public static FunType lookupFun(String id) {};
    public static void updateVar(String id, type ty) {};
}