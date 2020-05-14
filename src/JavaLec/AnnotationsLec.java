package JavaLec;

public class AnnotationsLec {

//    Placement of annotations
//
//    @Entity // annotating a CLASS
//    public class Product {
//        @Persistent // annotating a property
//        protected String name = null;
//
//        @Getter // annotation a METHOD
//        public String getName() {
//            return name;
//        }
//
//        // annotating a PARAMETER
//        public void setName(@Optional name) {
//            this.name = name;
//        }
//
//        public List addToCart(List cart) {
//            @Optional // annotating LOCAL VARIABLE
//                    List localCart = cart == null ? new ArrayList() : cart;
//            localCart.add(getName());
//            return localCart;
//        }
//    }

//    Annotations will not effect the code that is running.

//    2 main groups of built in annotations: compile time, run-time;
//    compile time = ways to annotate our code. Compiler makes the decision on whether it can compile.
//  Java comes with 3 compile-time:  deprecated, override, suppressWarnings

//    DEPRECATED:
//    all placements work -means: "should no longer be used." OR "We will be changing this soon
//    be careful using it"
//    -When marked, strikethrough warning.

//    @Deprecated(since: "Use the other method instead.")
//
//    OVERRIDE:
//    allows us to say if we are inheriting- supposed to override something and if it doesnt throw errors
//    -better to use this annotation bc it verifies.
//    verifying the method is overriding the parent class

//    SUPPRESS WARNINGS:


}
