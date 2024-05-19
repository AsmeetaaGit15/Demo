package test;

class Eight {
    void ChemicalReactions() {
        System.out.println("Class 8th: Different types of chemical reactions");
    }
}

class Nine extends Eight {
void ChemicalReactions() {
        System.out.println("Class 9th: Balancing chemical equations");
    }
}

class Ten extends Nine {
	void ChemicalReactions() {
        System.out.println("Class 10th: Laws of conservation of mass");
    }
}

public class PolymorphismOverride {
    public static void main(String[] args) {
        Eight E8 = new Eight();    
        Nine N9 = new Nine();
        Ten T10 = new Ten();
        
        E8.ChemicalReactions();
        N9.ChemicalReactions();
        T10.ChemicalReactions();
    }
}
