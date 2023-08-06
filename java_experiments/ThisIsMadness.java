package java_experiments;

import static java_experiments.ThisIsMadness.StaticStuff.aMethod;

class ThisIsMadness {
    static class StaticStuff {
        static void aMethod() {
        }
    }


    static class NonStaticStuff {
        void aMethod() {
        }

        void usage() {
            this.aMethod(); // instance method usage
            aMethod(); // same: instance method usage
            StaticStuff.aMethod(); // static method usage
        }
    }
}
