class HospitalRunner{
	
	public static void main(String... args){
		
		Hospital hospital=new MultiSpecialityHospital("holly cross","ckm",100,50,false);
		System.out.println("hospitalName:"+hospital.hospitalName);
		System.out.println("location:"+hospital.location);
		System.out.println("numberOfBeds:"+hospital.numberOfBeds);
		System.out.println("numberOfDoctors:"+hospital.numberOfDoctors);
		System.out.println("isEmergencyAvailable:"+hospital.isEmergencyAvailable);
		
	}

}