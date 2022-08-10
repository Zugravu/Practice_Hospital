package com.example.db14.mapper;

import com.example.db14.dto.DoctorDto;
import com.example.db14.model.Doctor;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-10T13:52:25+0300",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class DoctorMapperImpl implements DoctorMapper {

    @Override
    public DoctorDto todoctorDto(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        DoctorDto doctorDto = new DoctorDto();

        doctorDto.setName( doctor.getName() );
        doctorDto.setSpecialty( doctor.getSpecialty() );

        return doctorDto;
    }
}
