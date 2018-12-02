package lib;

import android.content.Context;

/**
 * Created by Gorav Gupta on 02-Jul-18.
 * Check ADB, Debugger, Root, Xposed, Emulator
 * Note: Do Not Add Other Code
 */

public class DGL {

    // ADB ( USB debugging is enable )
    public static boolean isAC(Context ctx) {
        return false;
    }

    // Detect debug
    public static boolean isDC(Context ctx) {
        return false;
    }

    // Detect Root
    public static boolean isRD(Context ctx) {
        return false;
    }

    // Detect Xposed
    public static boolean isXD(Context ctx) {
        return false;
    }

    // Detect Emulator
    public static boolean isED(Context ctx) {
        return false;
    }
}

// Add your proguard config file

/* -keepclasseswithmembers public class lib.DGL* {
	public static boolean is*(android.content.Context);
} */