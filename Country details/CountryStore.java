class CountryStore{
	
	Country[] countries=new Country[10];
	int index=0;
	
	void save(Country country){
		System.out.println("getting the saves details");
		if(this.index<this.countries.length){
			this.countries[this.index]=country;
			System.out.println("getting the details:"+this.index);
			index++;
		}
	}

	void display(){
		for(Country start:countries){
			if(start!=null){
				start.display();
			}
		}
	}
	
	Country findByName(String name){
        for(Country count : countries){
            if(count != null && count.name.equals(name)){   
                return count;
            }
        }
        return null;
    }

    State findStateByStateName(String name){
        for(Country count : countries){
            if(count != null){
                for(State start : count.states){  
                    if(start != null && start.name.equals(name)){
                        return start;
                    }
                }
            }
        }
        return null;
    }

    City[] findAllCityByStateName(String name){
        for(Country count : countries){
            if(count != null){
                for(State start : count.states){  
                    if(start != null && start.name.equals(name)){
                        return new City[]{start.city}; 
                    }
                }
            }
        }
        return null;
    }

    int findNoOfDistrictsByCityName(String name){
        for(Country count : countries){
            if(count != null){
                for(State start : count.states){  
                    if(start != null && start.city.name.equals(name)){
                        return start.city.noOfDistricts;
                    }
                }
            }
        }
        return 0;
    }

    Country findByCollectorName(String collectorName){
        for(Country count : countries){
            if(count != null){
                for(State start : count.states){  
                    if(start != null){
                        City city = start.city;
                        for(District dist : city.districts){   
                            if(dist != null && dist.collector.name.equals(collectorName)){
                                return count;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}