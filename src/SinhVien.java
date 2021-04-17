public class SinhVien {
    private String name;
    private int age;
    private String gender;
    private String telephoneNumber;
    private String adress;

    public SinhVien(String name, int age, String gender, String telephoneNumber, String adress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.telephoneNumber = telephoneNumber;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "-Name= " + name + "\n"+
                "-age= " + age +"\n"+
                "-gender= " + gender + "\n" +
                "-telephoneNumber= " + telephoneNumber + "\n" +
                "-adress= " + adress
                ;
    }
}
