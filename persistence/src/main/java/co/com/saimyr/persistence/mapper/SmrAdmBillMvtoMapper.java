package co.com.saimyr.persistence.mapper;

import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.SmrAdmBillMvto;
import co.com.saimyr.persistence.entity.SaimyrAdmFacDet;
import co.com.saimyr.persistence.entity.SaimyrAdmFacMvto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {SmrAdmBillMapper.class})
public interface SmrAdmBillMvtoMapper {
    @Mappings({
            @Mapping(source = "id.consFac", target = "consBill"),
            @Mapping(source = "id.ano", target = "year"),
            @Mapping(source = "id.consMpio", target = "consMpio"),
            @Mapping(source = "id.consMvto", target = "consMvto"),
            @Mapping(source = "fechaMvto", target = "mvtoDate"),
            @Mapping(source = "docSoporte", target = "soportDoc"),
            @Mapping(source = "tipPago", target = "payType"),
            @Mapping(source = "usuario", target = "user"),
            @Mapping(source = "valor", target = "value"),
            @Mapping(source = "estado", target = "statu"),
    })
    SmrAdmBillMvto toSmrAdmBillMvto (SaimyrAdmFacMvto saimyrAdmFacMvto);
    List<SmrAdmBillMvto> toSmrAdmBillMvtos (List<SaimyrAdmFacMvto> saimyrAdmFacMvtos);

    @InheritInverseConfiguration
    SaimyrAdmFacMvto toSaimyrAdmFacMvto (SmrAdmBillMvto smrAdmBillMvto);
}

