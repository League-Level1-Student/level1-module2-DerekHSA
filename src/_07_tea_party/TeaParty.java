package _07_tea_party;


	public class TeaParty {
		String greeting;
        public String welcome(String name, boolean isWoman, boolean isKnighted) {
        if (isWoman==true) {
		if (isKnighted==true) {
			greeting = "Hello "+"Lady "+name;
		}else {
			greeting = "Hello "+"Ms "+name;
		}
		}else {
		if (isKnighted==true) {
			greeting = "Hello "+"Sir "+name;	
			}else {
				greeting = "Hello "+"Mr "+name;
			}
		}
        	
        	
        	
        	return greeting;
        
        }


}

