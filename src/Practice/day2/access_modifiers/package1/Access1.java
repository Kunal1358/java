package Practice.day2.access_modifiers.package1;

public class Access1 {

    // default private protected public


    protected int hours=10;
    public int min=12;

}
/*

Private: The access level of a private modifier is only within the class.
        It cannot be accessed from outside the class.

Default: The access level of a default modifier is only within the package.
        It cannot be accessed from outside the package. If you do not specify
        any access level, it will be the default.

Protected: The access level of a protected modifier is within the package and outside
            the package through child class. If you do not make the child class, it cannot
            be accessed from outside the package.
Public: The access level of a public modifier is everywhere. It can be accessed from
        within the class, outside the class, within the package and outside the package.

 */


// in default we can't access across different packages
// while in public we can

// protected allow access in same package but not in different.

// private used in same class
