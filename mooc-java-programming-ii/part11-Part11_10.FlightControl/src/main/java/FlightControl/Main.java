package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FlightControl control = new FlightControl();
        TextUI ui = new TextUI(control, scanner);
        ui.start();

    }
}