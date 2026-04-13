package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car); // 운전자는 이 시점에 차가 생김
        driver.drive();


        // 추가
        Model3Car model3Car = new Model3Car();
        driver.setModel3Car(model3Car);
        driver.setK3Car(null);
        driver.drive();
    }
}
