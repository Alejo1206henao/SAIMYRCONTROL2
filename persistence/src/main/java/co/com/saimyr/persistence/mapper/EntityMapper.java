package co.com.saimyr.persistence.mapper;

import co.com.saimyr.domain.dto.EntityDTO;
import co.com.saimyr.persistence.entity.SaimyrGttMunicipioCodigo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EntityMapper {
    @Mapping(source = "consMpio", target = "entityId")
    @Mapping(source = "nombre", target = "name")
    @Mapping(source = "lema", target = "motto")
    @Mapping(source = "direccion", target = "address")
    @Mapping(source = "telefono", target = "phone")
    @Mapping(source = "mail", target = "email")
    EntityDTO toEntity(SaimyrGttMunicipioCodigo municipio);
}

