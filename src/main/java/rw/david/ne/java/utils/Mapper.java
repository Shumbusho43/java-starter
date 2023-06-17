package rw.david.ne.java.utils;

import org.modelmapper.ModelMapper;
import rw.david.ne.java.models.User;

public class Mapper {

    public static ModelMapper modelMapper = new ModelMapper();

    public static User getUserFromDTO(Object object) {
        return modelMapper.map(object, User.class);
    }


}
