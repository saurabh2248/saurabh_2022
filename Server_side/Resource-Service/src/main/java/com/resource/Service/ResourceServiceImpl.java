package com.resource.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.resource.Entity.Resource;

@Service
public class ResourceServiceImpl implements IResourceService {
	
	
	List<Resource> list = List.of(
			new Resource(1L,"peter@Gmail.com","peter","React Dev",1001L ),
			new Resource(2L,"Nishant@Gmail.com","nishantt","Java Dev",1002L ),
			new Resource(3L,"philip@Gmail.com","philip","Node js Dev",1002L ),
			new Resource(4L,"sam@Gmail.com","Sam","Node JS",1003L ),
			new Resource(5L,"Vinay@Gmail.com","vinay","Node Dev",1004L ),
			new Resource(6L,"sameer@Gmail.com","Sameer","React Dev",1004L ),
			new Resource(7L,"Loki@Gmail.com","Loki","Angular Dev",1005L ),
			new Resource(8L,"Steve@Gmail.com","Steve","Java, devops Dev",1005L ),
			new Resource(9L,"pritam@Gmail.com","pritam","AWS, Jenkins",1006L ),
			new Resource(10L,"Satya@Gmail.com","Satya","React Dev",1001L )
			);	

	@Override
	public List<Resource> getResourceForUsers(Long userID) {
		return list.stream().filter(resource -> resource.getUserID().equals(userID)).collect(Collectors.toList());
	}

}