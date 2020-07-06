//2020.7.6 Uto-hong 
//I completed this small project in my university's Basic Java Programing class(2020-1). This class's Advisor is Prof. Jun Hwang.

//This project's Progress steps : 
  //1. Person class & Person class's ToString() 
  //2. Management class's addPerson(), searchName(), searchPhone() and UserInterface class's case 2(Input new address), case 3(Search the address)
  //3. Management class's deleteByName(), deleteByPhone() and UserInterface class's case 4(View the entire addressbook), case 6(Delete the address)
  //4. Management class's modify(), UserInterface class's case 5(Modify the data)
  //5. Person class's writeMyField(), Management class's writeFile(), UserInterface class's case 8(Export the data as file)
  //6. Person class's readMyField(), Management class's readFile(), UserInterface class's case 1(Import the data from file)
  

//Person class is an important unit that you use to handle the data.
//If you write address in the UserInterface class, then Management class will save one person's data as one Person class data type. (class is user-defined data type)

import java.io.*;

public class Person {
		//Define variables
		private String name;   		
		private String phone;		
		private String birth;		
		private String mail;		
		private String address;		
		
		//constructor1
		public Person()
		{
			name = "";
			phone = "";
			birth = "";
			address = "";
			mail = "";
		}
		 //constructor2
		public Person(String name,String phone,String birth,String mail,String address)
		{
			 this.name = name;
			 this.phone = phone;
			 this.birth = birth;
			 this.mail = mail;
			 this.address = address;
		}
		
		//getter(), setter()
		public String getName()
		{
			 return name;
		}
		
		public void setName(String name)
		{
			 this.name = name;
		}
		
		public String getPhone()
		{
			 return phone;
		}
		
		public void setPhone(String phone)
		{
			 this.phone = phone;
		}
		
		public String getBirth()
		{
			 return birth;
		}
		
		public void setBirth(String birth)
		{
			 this.birth = birth;
		}
		
		public String getMail()
		{
			 return mail;
		}
		
		public void setMail(String mail)
		{
			 this.mail = mail;
		}
		
		public String getAddress()
		{
			 return address;
		}
		
		public void setAddress(String address)
		{
			 this.address = address;
		}
		
		public String ToString() 
		{
			return name+"\n"+phone+"\n"+birth+"\n"+mail+"\n"+address;
		}
		
		//5. Export the data as a file.
		//User writes the data. - > Management class saves the data as Person class. - > Export as file.
		public void writeMyField(DataOutputStream file)
		{
			try {
				file.writeUTF(name);
				file.writeUTF(phone);
				file.writeUTF(birth);
				file.writeUTF(mail);
				file.writeUTF(address);
			}
			catch(IOException ioe) {
			}
		} 
		
		//6. Import the data from a file.
		//Read the data from a file created in 5.
		public void readMyField(DataInputStream file)
		{
			try {
				name = file.readUTF();
				phone = file.readUTF();
				birth = file.readUTF();
				mail = file.readUTF();
				address = file.readUTF();
			}catch(IOException ioe) {
			}
		}
}
