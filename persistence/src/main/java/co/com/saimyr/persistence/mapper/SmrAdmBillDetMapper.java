package co.com.saimyr.persistence.mapper;

import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.persistence.entity.SaimyrAdmFacDet;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring", uses = {SmrAdmBillMapper.class})
public interface SmrAdmBillDetMapper {
    @Mappings({
            @Mapping(source = "id.consFac", target = "consBill"),
            @Mapping(source = "id.ano", target = "year"),
            @Mapping(source = "id.consMpio", target = "consMpio"),
            @Mapping(source = "id.consDet", target = "consDet"),
            @Mapping(source = "id.consMaster", target = "consMaster"),
            @Mapping(source = "regalo", target = "gift"),
            @Mapping(source = "valorUnitario", target = "unitValue"),
            @Mapping(source = "impuesto", target = "tax"),
            @Mapping(source = "valorBruto", target = "grossValue"),
            @Mapping(source = "total", target = "total"),
    })
    SmrAdmBillDet toSmrAdmBillDet (SaimyrAdmFacDet saimyrAdmFacDet);
    List<SmrAdmBillDet> toSmrAdmBillDets (List<SaimyrAdmFacDet> saimyrAdmFacDets);

    @InheritInverseConfiguration
    SaimyrAdmFacDet SaimyrAdmFacDet (SmrAdmBillDet smrAdmBillDet);
}
