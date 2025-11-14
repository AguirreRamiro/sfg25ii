package jasfg25ii;

import db.conectar;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import modelo.*;
import vista.mdiSFG25;

public class JaSFG25II {

    public static void main(String[] args) throws MiExcepcionPersonalizada {
        
        mdiSFG25 mdi = new mdiSFG25();
        mdi.show(true);
    }
}
