package co.com.saimyr.persistence.mapper;

import co.com.saimyr.domain.SmrAdmBillDet;
import co.com.saimyr.domain.dto.BillAdmDetDTO;
import co.com.saimyr.persistence.entity.SaimyrAdmFacDet;
import org.mapstruct.*;

import java.util.List;
import java.util.Optional;

@Mapper (componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
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
    BillAdmDetDTO toBillDetDto (SaimyrAdmFacDet admFacDet);
    List<BillAdmDetDTO> toDetDto (List<SaimyrAdmFacDet> admFacDets);

    @Mappings({
            @Mapping(target = "id.consFac", source = "consBill"),
            @Mapping(target = "id.ano", source = "year"),
            @Mapping(target = "id.consMpio", source = "consMpio"),
            @Mapping(target = "id.consDet", source = "consDet"),
            @Mapping(target = "id.consMaster", source = "consMaster"),
            @Mapping(target = "regalo", source = "gift"),
            @Mapping(target = "valorUnitario", source = "unitValue"),
            @Mapping(target = "impuesto", source = "tax"),
            @Mapping(target = "valorBruto", source = "grossValue"),
            @Mapping(target = "total", source = "total"),
    })

    SaimyrAdmFacDet toSaimyrAdmDet (SmrAdmBillDet smrAdmBillDet);
}
