package lesson6;

import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractionList;

    public Park(String name) {
        this.name = name;
    }

    public Park(String name, List<Attraction> attractionList) {
        this.name = name;
        this.attractionList = attractionList;
    }

    public String getName() {
        return name;
    }

    public List<Attraction> getAttractionList() {
        return attractionList;
    }


    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;


        public String getAttractionName() {
            return attractionName;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;

        }


        }
    }















