package de.telran.home20240123.home;

public class Home {
    private int homeSize;
    private Roof roof;
    private Walls walls;
    private Doors doors;
    private Windows windows;
    private Residents[] residents;

    public Home(int homeSize) {
        this.homeSize = homeSize;
    }

    public int getHomeSize() {
        return homeSize;
    }

    public void setHomeSize(int homeSize) {
        this.homeSize = homeSize;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Walls getWalls() {
        return walls;
    }

    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    public Doors getDoors() {
        return doors;
    }

    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    public Windows getWindows() {
        return windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public Residents[] getResidents() {
        return residents;
    }

    public void setResidents(Residents[] residents) {
        this.residents = residents;
    }

    public void buitHome() {
        System.out.print("Построенный дом размером " + getHomeSize() + " квартир, ");
        System.out.print(Doors.getDoorsShape() + " " + getDoors().getNumbersOfDoors() + " дверей, ");
        System.out.print(getRoof().getRoofBase() + " " + getRoof().getRoofSize() + " крыша ");
        System.out.print(getWalls().getWallsShape() + " " + getWalls().getNumbersOfWalls() + " стен, ");
        System.out.print(getWindows().getNumbersOfWindows() + " " + getWindows().getWindowsShape() + " окон.");
    }

    public void residentOfHome(Residents[] residents) {
        System.out.println("Жильцы: ");
        for (int i = 0; i < residents.length; i++) {
            System.out.println((i + 1) + "." + getResidents()[i].getUsername() + ", " + getResidents()[i].getAge() + ", " + getResidents()[i].getGender() + ".");
        }
    }
}
