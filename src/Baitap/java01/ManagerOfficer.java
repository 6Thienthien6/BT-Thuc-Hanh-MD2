package Baitap.java01;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
        private List<Canbo> canbo;
        public ManagerOfficer(){
                this.canbo = new ArrayList<>();
        }
        public void addCanbo(Canbo canbo){
                this.canbo.add(canbo);
        }
        public List<Canbo> searchCanboByName(String name){
                return this.canbo.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
        }
        public void showListinforCanbo(){
                this.canbo.forEach(o -> System.out.println(o.toString()));
        }
}
