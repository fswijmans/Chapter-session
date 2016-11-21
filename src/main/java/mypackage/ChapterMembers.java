package mypackage;

import java.util.ArrayList;
import java.util.Optional;

public class ChapterMembers {

    private static ArrayList<Member> members = null;
    private ChapterMembers() {}

    public static ArrayList<Member> getDataset() {
        if(members == null) {
            members = new ArrayList<>();
        }

        members.add(new Member("Arthur", "Financieel fit", 45, 8, FavoriteAnimal.BUNNY, false));
        members.add(new Member("Ciska", "Ivy", 645, 78, FavoriteAnimal.BIRD, true));
        members.add(new Member("Frank", "Ivy", 345, 87651, FavoriteAnimal.BUNNY, true));
        members.add(new Member("Harold", "Ivy", 34, 45, null, false));
        members.add(new Member("Jelle", "Team Z", 2, 567, FavoriteAnimal.BUNNY, false));
        members.add(new Member("Joeri", "EZ Jet", 4334, 786, null, true));
        members.add(new Member("Kees", "Verzekeren", 2354, 3, FavoriteAnimal.BIRD, false));
        members.add(new Member("Martin", "Future fit", 564, 23432, FavoriteAnimal.DOG, true));
        members.add(new Member("Ramon", "Vermogen", 345, 23, FavoriteAnimal.DOG, false));
        members.add(new Member("Roberto", "Ivy", 5678, 0, FavoriteAnimal.ING_LION, true));
        members.add(new Member("Sander", "Financieel fit", 11, 89, null, false));
        members.add(new Member("Varun", "Ivy", 234, 23, FavoriteAnimal.BIRD, false));
        members.add(new Member("Vincent", "Vermogen", 678, 23, FavoriteAnimal.BUNNY, false));
        members.add(new Member("Wim", "Ivy", 4322, 87, FavoriteAnimal.CAT, true));

        return members;
    }

    public enum FavoriteAnimal {
        CAT, DOG, BIRD, ING_LION, BUNNY, NONE
    }

    public static class Member {
        private String name;
        private String squad;
        private int id;
        private Optional<Integer> cookies;
        private Optional<FavoriteAnimal> animal;
        private boolean hasPets;

        Member(String name, String squad, int id, Integer cookies, FavoriteAnimal animal, boolean hasPets) {
            this.name = name;
            this.squad = squad;
            this.id = id;
            this.cookies = Optional.ofNullable(cookies);
            this.animal = Optional.ofNullable(animal);
            this.hasPets = hasPets;
        }

        public Optional<Integer> getCookies() {
            return cookies;
        }

        public String getName() {
            return name;
        }

        public String getSquad() {
            return squad;
        }

        public int getId() {
            return id;
        }

        public Optional<FavoriteAnimal> getAnimal() {
            return animal;
        }

        public boolean isHasPets() {
            return hasPets;
        }

    }

}
