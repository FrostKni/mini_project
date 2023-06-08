package STORE_DATA;

public class storing_data {
    int id;
    int year;
    String city;
    public storing_data(int id, int year, String city)
    {
        this.id=id;
        this.year=year;
        this.city=city;
        print();
    }
    public void print(){
        System.out.println(id);
        System.out.println(year);
        System.out.println(city);

    }


}
