package newJavaFeatures;

public class SwitchExpression {

    public static void main(String[] args) {
        System.out.println("java 11 out put");
        System.out.println(formatter(1L));
        System.out.println(formatter(1));
        System.out.println("----------------------");

        System.out.println("java 17 out put");
        System.out.println(formatterJava17(1L));
        System.out.println(formatterJava17(1));
        System.out.println("----------------------");


        System.out.println("java 21 out put");
        System.out.println(formatterJava21(1L));
        System.out.println(formatterJava21(1));
    }

    // JAVA 11
    public static String formatter(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer) {
            formatted = String.format("int %d", o);
        } else if (o instanceof Long) {
            formatted = String.format("long %d", o);
        } else if (o instanceof Double) {
            formatted = String.format("double %f", o);
        } else if (o instanceof String) {
            formatted = String.format("String %s", o);
        }
        return formatted;
    }

    // JAVA 17 (16 +)
    public static String formatterJava17(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }
    // JAVA 21
    public static String formatterJava21(Object o) {
        return switch(o) {
            case null -> "null";
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> "n/a";
        };
    }

}
