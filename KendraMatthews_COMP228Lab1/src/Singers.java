public class Singers {
    public int id;
    public String name;
    public String address;
    public String birthdate;
    public int albums;

    public Singers() {
        id = 0;
        name = "no data";
        address = "no data";
        birthdate = "no data";
        albums = 0;
    }


    public Singers(int id, String name, String address, String birthdate, int albums) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.albums = albums;
        this.birthdate = birthdate;
    }

    public String getname() {
        return name;
    }

    public int getid() {
        return id;
    }

    public String getaddress() {
        return address;
    }

    public int getalbums() {
        return albums;
    }

    public String getbirthdate() {
        return birthdate;
    }

    public void Setter(String name, String address, String birthdate, int id, int albums) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.albums = albums;
        this.birthdate = birthdate;
    }

    public void Setname(String name) {
        this.name = name;
    }

    public void Setaddress(String address) {
        this.address = address;
    }

    public void Setbirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void Setid(int id) {
        this.id = id;
    }

    public void Setalbums(int albums) {
        this.albums = albums;
    }

    public void Displaysingerinfo(){
        System.out.println("Singer Information Available:");

        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Address: " + this.address);
        System.out.println("Birthdate: " + this.birthdate);
        System.out.println("Number of Albums: " + this.albums);

    }

}


