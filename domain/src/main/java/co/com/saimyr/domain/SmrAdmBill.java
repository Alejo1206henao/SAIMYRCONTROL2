package co.com.saimyr.domain;

import co.com.saimyr.domain.dto.SmrAdmBillDTO;
import co.com.saimyr.domain.dto.SmrBillDTO;


import static co.com.saimyr.domain.exception.validation.DomainValidator.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class SmrAdmBill {
    private static final String ENTITY_ID_INVALID_MESSAGE = "El id de la entidad no es válido";
    private static final String CURRENT = "V";
    private int consBill;
    private int consMpio;
    private int numberId;
    private String smrNumber;
    private int idElectronic;
    private String name;
    private LocalDate date;
    private String status;
    private int total;

    public SmrAdmBill (SmrAdmBillDTO dto){
        validatePositive((double) dto.getConsMpio(), ENTITY_ID_INVALID_MESSAGE, DEFAULT_MESSAGE);
        setConsMpio(dto.getConsMpio());
        setDate(LocalDate.now());
        setIdElectronic(dto.getIdElectronico());
        setSmrNumber(dto.getNumero());
        setNumberId(dto.getIdentificacion());
        setName(dto.getNombre());
        setStatus(CURRENT);
        setTotal(dto.getTotal());
    }

    public static List<SmrAdmBill> convertToList(List<SmrAdmBillDTO> smrBillDTOList){
        return smrBillDTOList.stream().map(SmrAdmBill::new).collect(Collectors.toList());
    }

    public int getConsBill() {
        return consBill;
    }

    public void setConsBill(int consBill) {
        this.consBill = consBill;
    }

    public int getConsMpio() {
        return consMpio;
    }

    public void setConsMpio(int consMpio) { this.consMpio = consMpio; }

    public int getNumberId() {
        return numberId;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public String getSmrNumber() {
        return smrNumber;
    }

    public void setSmrNumber(String smrNumber) {
        this.smrNumber = smrNumber;
    }

    public int getIdElectronic() {
        return idElectronic;
    }

    public void setIdElectronic(int idElectronic) {
        this.idElectronic = idElectronic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
