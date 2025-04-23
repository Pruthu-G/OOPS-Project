public class Address {
    public class Area {
        private String name;
        Area(String name) {
            this.name=name;
        }
    }
    public class Street  {
        private String name;
        Street(String name) {
            this.name=name;
        }

    }
    public class House {
        private String name;
        private int[] pose;
        House(String name) {
            this.name=name;
        }
    }
    private Area area;
    private Street street;
    private House house;

    
    Address (String s) {
        String [] addr = s.split(",");
        this.area=new Area(addr[0]);
        this.street=new Street(addr[1]);
        this.house=new House(addr[2]);
    }
    public Area getArea() {
        return area;
    }
    public Street getStreet() {
        return street;
    }

    public House getHouse() {
        return house;
    }
}
