public class Interpreter {

    public Integer eval(Exp e) {
        return e.accept(new Value(), null) ;
    }

    private Class Value implements Exp. Visitor<Integer, Object> {
        public Integer visit (Eadd p, Object arg) {
            return eval(p.exp_1) + eval(p.exp_2);
        }

        public Integer visit (EMul p, Object arg) {
            return eval(p.exp_1) * eval(p.exp_2);
        }

        public Integer visit (EInt p, Object arg) {
            return p.integer_;
        }
    }

}