package Constructor;

	class ConstructorOverloading {
		int id;
		String name;
		String gender;
		ConstructorOverloading(int i , String n){
			id = i;
			name= n;
		}
		ConstructorOverloading(int i,String n,String g){
			id = i;
			name= n;
			gender = g;
		}
		void test(){
			System.out.println(id+""+name+""+gender);
		}
		

}
