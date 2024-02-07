package de.telran.home20240123.home;

public class Windows {
    private static String windowsShape;
    private static int numbersOfWindows;

    public Windows(String windowsShape, int numbersOfWindows) {
        this.windowsShape = windowsShape;
        this.numbersOfWindows = numbersOfWindows;
    }

    public static String getWindowsShape() {
        return windowsShape;
    }

    public void setWindowsShape(String windowsShape) {
        this.windowsShape = windowsShape;
    }

    public static int getNumbersOfWindows() {
        return numbersOfWindows;
    }

    public void setNumbersOfWindows(int numbersOfWindows) {
        this.numbersOfWindows = numbersOfWindows;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "windowsShape='" + windowsShape + '\'' +
                ", numbersOfWindows=" + numbersOfWindows +
                '}';
    }
}
