package com.DevOps2022.jobopeningservice.helper.mappers;

import java.util.ArrayList;
import java.util.List;

import com.DevOps2022.jobopeningservice.helper.dto.JobOpeningDTO;
import com.DevOps2022.jobopeningservice.model.JobOpening;

public class JobOpeningMapper implements MapperInterface<JobOpening, JobOpeningDTO>{

    @Override
    public JobOpening toEntity(JobOpeningDTO dto) {
        JobOpening opening = new JobOpening();
        opening.setCompany(dto.getCompany());
        opening.setTitle(dto.getTitle());
        opening.setDescription(dto.getDescription());
        opening.setLink(dto.getLink());
        opening.setRequirements(dto.getRequirements());
        opening.setSeniority(dto.getSeniority());
        opening.setAuthor(dto.getAuthor());
        return opening;
    }

    @Override
    public List<JobOpening> toEntityList(List<JobOpeningDTO> dtoList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public JobOpeningDTO toDto(JobOpening entity) {
        JobOpeningDTO dto = new JobOpeningDTO();
        dto.setId(entity.getId());
        dto.setCompany(entity.getCompany());
        dto.setTitle(entity.getTitle());
        dto.setDescription(entity.getDescription());
        dto.setLink(entity.getLink());
        dto.setRequirements(entity.getSeniority());
        dto.setSeniority(entity.getSeniority());
        dto.setAuthor(entity.getAuthor());
        return dto;
    }

    @Override
    public List<JobOpeningDTO> toDtoList(List<JobOpening> entityList) {
        List<JobOpeningDTO> dtoList = new ArrayList<JobOpeningDTO>();

        for(JobOpening entity : entityList) {
            JobOpeningDTO dto = toDto(entity);
            dtoList.add(dto);
        }    

        return dtoList;
    }
    
}
