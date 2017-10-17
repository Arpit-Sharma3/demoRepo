/**
 * Program having Abstract and interface togethor.
 */
interface AA {
    void a();

    void b();

    void c();

    void d();
}

abstract class BB implements AA {
    public void c() {
        System.out.println("I am C");
    }
}

class M extends BB {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }
}

class DemoAbstractVsInterface {
    public static void main(String args[]) {
        AA a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}