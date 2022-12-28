package co.com.saimyr.persistence.mapper;

import co.com.saimyr.domain.SmrAdmBill;
import co.com.saimyr.persistence.entity.SaimyrAdmFactura;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmrAdmBillMapper {
    @Mappings({
            @Mapping(source = "id.consFac", target = "consBill"),
            @Mapping(source = "id.ano", target = "year"),
            @Mapping(source = "id.consMpio", target = "consMpio"),
            @Mapping(source = "identificacion", target = "numberId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "idElectronico", target = "idElectronic"),
            @Mapping(source = "smrNumero", target = "smrNumber"),
            @Mapping(source = "estado", target = "statu"),
            @Mapping(source = "total", target = "total")
    })
    SmrAdmBill toSmrAdmBill(SaimyrAdmFactura saimyrAdmFactura);
    List<SmrAdmBill> toSmrAdmBills (List<SaimyrAdmFactura> saimyrAdmFacturas);

    @InheritInverseConfiguration
    SaimyrAdmFactura toSaimyrAdmFactura (SmrAdmBill smrAdmBill);
    List<SaimyrAdmFactura> toSaimyrAdmFacturaList (List<SmrAdmBill> smrAdmBillList);

}
