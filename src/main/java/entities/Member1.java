/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gebruiker
 */
@Entity
@Table(name = "member")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Member1.findAll", query = "SELECT m FROM Member1 m"),
    @NamedQuery(name = "Member1.findById", query = "SELECT m FROM Member1 m WHERE m.id = :id"),
    @NamedQuery(name = "Member1.findByAchternaam", query = "SELECT m FROM Member1 m WHERE m.achternaam = :achternaam"),
    @NamedQuery(name = "Member1.findByBuitenritten", query = "SELECT m FROM Member1 m WHERE m.buitenritten = :buitenritten"),
    @NamedQuery(name = "Member1.findByDraftsport", query = "SELECT m FROM Member1 m WHERE m.draftsport = :draftsport"),
    @NamedQuery(name = "Member1.findByDressuur", query = "SELECT m FROM Member1 m WHERE m.dressuur = :dressuur"),
    @NamedQuery(name = "Member1.findByEbdurance", query = "SELECT m FROM Member1 m WHERE m.ebdurance = :ebdurance"),
    @NamedQuery(name = "Member1.findByEventing", query = "SELECT m FROM Member1 m WHERE m.eventing = :eventing"),
    @NamedQuery(name = "Member1.findByFokken", query = "SELECT m FROM Member1 m WHERE m.fokken = :fokken"),
    @NamedQuery(name = "Member1.findByGeboortedatum", query = "SELECT m FROM Member1 m WHERE m.geboortedatum = :geboortedatum"),
    @NamedQuery(name = "Member1.findByInenverkoop", query = "SELECT m FROM Member1 m WHERE m.inenverkoop = :inenverkoop"),
    @NamedQuery(name = "Member1.findByInputemail13", query = "SELECT m FROM Member1 m WHERE m.inputemail13 = :inputemail13"),
    @NamedQuery(name = "Member1.findByMemberid", query = "SELECT m FROM Member1 m WHERE m.memberid = :memberid"),
    @NamedQuery(name = "Member1.findByMennen", query = "SELECT m FROM Member1 m WHERE m.mennen = :mennen"),
    @NamedQuery(name = "Member1.findByNaturalhorsemanship", query = "SELECT m FROM Member1 m WHERE m.naturalhorsemanship = :naturalhorsemanship"),
    @NamedQuery(name = "Member1.findByOvermij", query = "SELECT m FROM Member1 m WHERE m.overmij = :overmij"),
    @NamedQuery(name = "Member1.findByPaard1", query = "SELECT m FROM Member1 m WHERE m.paard1 = :paard1"),
    @NamedQuery(name = "Member1.findByPaard2", query = "SELECT m FROM Member1 m WHERE m.paard2 = :paard2"),
    @NamedQuery(name = "Member1.findByPaard3", query = "SELECT m FROM Member1 m WHERE m.paard3 = :paard3"),
    @NamedQuery(name = "Member1.findByPaard4", query = "SELECT m FROM Member1 m WHERE m.paard4 = :paard4"),
    @NamedQuery(name = "Member1.findByPaard5", query = "SELECT m FROM Member1 m WHERE m.paard5 = :paard5"),
    @NamedQuery(name = "Member1.findByPaard6", query = "SELECT m FROM Member1 m WHERE m.paard6 = :paard6"),
    @NamedQuery(name = "Member1.findByPaard7", query = "SELECT m FROM Member1 m WHERE m.paard7 = :paard7"),
    @NamedQuery(name = "Member1.findByPaard8", query = "SELECT m FROM Member1 m WHERE m.paard8 = :paard8"),
    @NamedQuery(name = "Member1.findByPaard9", query = "SELECT m FROM Member1 m WHERE m.paard9 = :paard9"),
    @NamedQuery(name = "Member1.findByPaard10", query = "SELECT m FROM Member1 m WHERE m.paard10 = :paard10"),
    @NamedQuery(name = "Member1.findByPaardentrainen", query = "SELECT m FROM Member1 m WHERE m.paardentrainen = :paardentrainen"),
    @NamedQuery(name = "Member1.findByPaardenverzorgen", query = "SELECT m FROM Member1 m WHERE m.paardenverzorgen = :paardenverzorgen"),
    @NamedQuery(name = "Member1.findByPassword", query = "SELECT m FROM Member1 m WHERE m.password = :password"),
    @NamedQuery(name = "Member1.findByPlaatsnamen", query = "SELECT m FROM Member1 m WHERE m.plaatsnamen = :plaatsnamen"),
    @NamedQuery(name = "Member1.findByPolo", query = "SELECT m FROM Member1 m WHERE m.polo = :polo"),
    @NamedQuery(name = "Member1.findByRensport", query = "SELECT m FROM Member1 m WHERE m.rensport = :rensport"),
    @NamedQuery(name = "Member1.findByRijdenlocatie", query = "SELECT m FROM Member1 m WHERE m.rijdenlocatie = :rijdenlocatie"),
    @NamedQuery(name = "Member1.findByRingsteken", query = "SELECT m FROM Member1 m WHERE m.ringsteken = :ringsteken"),
    @NamedQuery(name = "Member1.findByRodeo", query = "SELECT m FROM Member1 m WHERE m.rodeo = :rodeo"),
    @NamedQuery(name = "Member1.findBySamentrainen", query = "SELECT m FROM Member1 m WHERE m.samentrainen = :samentrainen"),
    @NamedQuery(name = "Member1.findByShowrijden", query = "SELECT m FROM Member1 m WHERE m.showrijden = :showrijden"),
    @NamedQuery(name = "Member1.findBySpringen", query = "SELECT m FROM Member1 m WHERE m.springen = :springen"),
    @NamedQuery(name = "Member1.findByVoedinggezondheid", query = "SELECT m FROM Member1 m WHERE m.voedinggezondheid = :voedinggezondheid"),
    @NamedQuery(name = "Member1.findByVoltige", query = "SELECT m FROM Member1 m WHERE m.voltige = :voltige"),
    @NamedQuery(name = "Member1.findByVoorlichting", query = "SELECT m FROM Member1 m WHERE m.voorlichting = :voorlichting"),
    @NamedQuery(name = "Member1.findByVoornaam", query = "SELECT m FROM Member1 m WHERE m.voornaam = :voornaam"),
    @NamedQuery(name = "Member1.findByVossenjacht", query = "SELECT m FROM Member1 m WHERE m.vossenjacht = :vossenjacht"),
    @NamedQuery(name = "Member1.findByWedstrijdsport", query = "SELECT m FROM Member1 m WHERE m.wedstrijdsport = :wedstrijdsport"),
    @NamedQuery(name = "Member1.findByWestern", query = "SELECT m FROM Member1 m WHERE m.western = :western"),
    @NamedQuery(name = "Member1.findByInsertionTime", query = "SELECT m FROM Member1 m WHERE m.insertionTime = :insertionTime")})
public class Member1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 2147483647)
    @Column(name = "achternaam")
    private String achternaam;
    @Column(name = "buitenritten")
    private Boolean buitenritten;
    @Column(name = "draftsport")
    private Boolean draftsport;
    @Column(name = "dressuur")
    private Boolean dressuur;
    @Column(name = "ebdurance")
    private Boolean ebdurance;
    @Column(name = "eventing")
    private Boolean eventing;
    @Column(name = "fokken")
    private Boolean fokken;
    @Column(name = "geboortedatum")
    @Temporal(TemporalType.DATE)
    private Date geboortedatum;
    @Column(name = "inenverkoop")
    private Boolean inenverkoop;
    @Size(max = 2147483647)
    @Column(name = "inputemail13")
    private String inputemail13;
    @Column(name = "memberid")
    private BigInteger memberid;
    @Column(name = "mennen")
    private Boolean mennen;
    @Column(name = "naturalhorsemanship")
    private Boolean naturalhorsemanship;
    @Size(max = 2147483647)
    @Column(name = "overmij")
    private String overmij;
    @Size(max = 2147483647)
    @Column(name = "paard1")
    private String paard1;
    @Size(max = 2147483647)
    @Column(name = "paard2")
    private String paard2;
    @Size(max = 2147483647)
    @Column(name = "paard3")
    private String paard3;
    @Size(max = 2147483647)
    @Column(name = "paard4")
    private String paard4;
    @Size(max = 2147483647)
    @Column(name = "paard5")
    private String paard5;
    @Size(max = 2147483647)
    @Column(name = "paard6")
    private String paard6;
    @Size(max = 2147483647)
    @Column(name = "paard7")
    private String paard7;
    @Size(max = 2147483647)
    @Column(name = "paard8")
    private String paard8;
    @Size(max = 2147483647)
    @Column(name = "paard9")
    private String paard9;
    @Size(max = 2147483647)
    @Column(name = "paard10")
    private String paard10;
    @Column(name = "paardentrainen")
    private Boolean paardentrainen;
    @Column(name = "paardenverzorgen")
    private Boolean paardenverzorgen;
    @Size(max = 2147483647)
    @Column(name = "password")
    private String password;
    @Size(max = 2147483647)
    @Column(name = "plaatsnamen")
    private String plaatsnamen;
    @Column(name = "polo")
    private Boolean polo;
    @Column(name = "rensport")
    private Boolean rensport;
    @Column(name = "rijdenlocatie")
    private Boolean rijdenlocatie;
    @Column(name = "ringsteken")
    private Boolean ringsteken;
    @Column(name = "rodeo")
    private Boolean rodeo;
    @Column(name = "samentrainen")
    private Boolean samentrainen;
    @Column(name = "showrijden")
    private Boolean showrijden;
    @Column(name = "springen")
    private Boolean springen;
    @Column(name = "voedinggezondheid")
    private Boolean voedinggezondheid;
    @Column(name = "voltige")
    private Boolean voltige;
    @Column(name = "voorlichting")
    private Boolean voorlichting;
    @Size(max = 2147483647)
    @Column(name = "voornaam")
    private String voornaam;
    @Column(name = "vossenjacht")
    private Boolean vossenjacht;
    @Column(name = "wedstrijdsport")
    private Boolean wedstrijdsport;
    @Column(name = "western")
    private Boolean western;
    @Column(name = "insertion_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertionTime;

    public Member1() {
    }

    public Member1(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Boolean getBuitenritten() {
        return buitenritten;
    }

    public void setBuitenritten(Boolean buitenritten) {
        this.buitenritten = buitenritten;
    }

    public Boolean getDraftsport() {
        return draftsport;
    }

    public void setDraftsport(Boolean draftsport) {
        this.draftsport = draftsport;
    }

    public Boolean getDressuur() {
        return dressuur;
    }

    public void setDressuur(Boolean dressuur) {
        this.dressuur = dressuur;
    }

    public Boolean getEbdurance() {
        return ebdurance;
    }

    public void setEbdurance(Boolean ebdurance) {
        this.ebdurance = ebdurance;
    }

    public Boolean getEventing() {
        return eventing;
    }

    public void setEventing(Boolean eventing) {
        this.eventing = eventing;
    }

    public Boolean getFokken() {
        return fokken;
    }

    public void setFokken(Boolean fokken) {
        this.fokken = fokken;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public Boolean getInenverkoop() {
        return inenverkoop;
    }

    public void setInenverkoop(Boolean inenverkoop) {
        this.inenverkoop = inenverkoop;
    }

    public String getInputemail13() {
        return inputemail13;
    }

    public void setInputemail13(String inputemail13) {
        this.inputemail13 = inputemail13;
    }

    public BigInteger getMemberid() {
        return memberid;
    }

    public void setMemberid(BigInteger memberid) {
        this.memberid = memberid;
    }

    public Boolean getMennen() {
        return mennen;
    }

    public void setMennen(Boolean mennen) {
        this.mennen = mennen;
    }

    public Boolean getNaturalhorsemanship() {
        return naturalhorsemanship;
    }

    public void setNaturalhorsemanship(Boolean naturalhorsemanship) {
        this.naturalhorsemanship = naturalhorsemanship;
    }

    public String getOvermij() {
        return overmij;
    }

    public void setOvermij(String overmij) {
        this.overmij = overmij;
    }

    public String getPaard1() {
        return paard1;
    }

    public void setPaard1(String paard1) {
        this.paard1 = paard1;
    }

    public String getPaard2() {
        return paard2;
    }

    public void setPaard2(String paard2) {
        this.paard2 = paard2;
    }

    public String getPaard3() {
        return paard3;
    }

    public void setPaard3(String paard3) {
        this.paard3 = paard3;
    }

    public String getPaard4() {
        return paard4;
    }

    public void setPaard4(String paard4) {
        this.paard4 = paard4;
    }

    public String getPaard5() {
        return paard5;
    }

    public void setPaard5(String paard5) {
        this.paard5 = paard5;
    }

    public String getPaard6() {
        return paard6;
    }

    public void setPaard6(String paard6) {
        this.paard6 = paard6;
    }

    public String getPaard7() {
        return paard7;
    }

    public void setPaard7(String paard7) {
        this.paard7 = paard7;
    }

    public String getPaard8() {
        return paard8;
    }

    public void setPaard8(String paard8) {
        this.paard8 = paard8;
    }

    public String getPaard9() {
        return paard9;
    }

    public void setPaard9(String paard9) {
        this.paard9 = paard9;
    }

    public String getPaard10() {
        return paard10;
    }

    public void setPaard10(String paard10) {
        this.paard10 = paard10;
    }

    public Boolean getPaardentrainen() {
        return paardentrainen;
    }

    public void setPaardentrainen(Boolean paardentrainen) {
        this.paardentrainen = paardentrainen;
    }

    public Boolean getPaardenverzorgen() {
        return paardenverzorgen;
    }

    public void setPaardenverzorgen(Boolean paardenverzorgen) {
        this.paardenverzorgen = paardenverzorgen;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPlaatsnamen() {
        return plaatsnamen;
    }

    public void setPlaatsnamen(String plaatsnamen) {
        this.plaatsnamen = plaatsnamen;
    }

    public Boolean getPolo() {
        return polo;
    }

    public void setPolo(Boolean polo) {
        this.polo = polo;
    }

    public Boolean getRensport() {
        return rensport;
    }

    public void setRensport(Boolean rensport) {
        this.rensport = rensport;
    }

    public Boolean getRijdenlocatie() {
        return rijdenlocatie;
    }

    public void setRijdenlocatie(Boolean rijdenlocatie) {
        this.rijdenlocatie = rijdenlocatie;
    }

    public Boolean getRingsteken() {
        return ringsteken;
    }

    public void setRingsteken(Boolean ringsteken) {
        this.ringsteken = ringsteken;
    }

    public Boolean getRodeo() {
        return rodeo;
    }

    public void setRodeo(Boolean rodeo) {
        this.rodeo = rodeo;
    }

    public Boolean getSamentrainen() {
        return samentrainen;
    }

    public void setSamentrainen(Boolean samentrainen) {
        this.samentrainen = samentrainen;
    }

    public Boolean getShowrijden() {
        return showrijden;
    }

    public void setShowrijden(Boolean showrijden) {
        this.showrijden = showrijden;
    }

    public Boolean getSpringen() {
        return springen;
    }

    public void setSpringen(Boolean springen) {
        this.springen = springen;
    }

    public Boolean getVoedinggezondheid() {
        return voedinggezondheid;
    }

    public void setVoedinggezondheid(Boolean voedinggezondheid) {
        this.voedinggezondheid = voedinggezondheid;
    }

    public Boolean getVoltige() {
        return voltige;
    }

    public void setVoltige(Boolean voltige) {
        this.voltige = voltige;
    }

    public Boolean getVoorlichting() {
        return voorlichting;
    }

    public void setVoorlichting(Boolean voorlichting) {
        this.voorlichting = voorlichting;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Boolean getVossenjacht() {
        return vossenjacht;
    }

    public void setVossenjacht(Boolean vossenjacht) {
        this.vossenjacht = vossenjacht;
    }

    public Boolean getWedstrijdsport() {
        return wedstrijdsport;
    }

    public void setWedstrijdsport(Boolean wedstrijdsport) {
        this.wedstrijdsport = wedstrijdsport;
    }

    public Boolean getWestern() {
        return western;
    }

    public void setWestern(Boolean western) {
        this.western = western;
    }

    public Date getInsertionTime() {
        return insertionTime;
    }

    public void setInsertionTime(Date insertionTime) {
        this.insertionTime = insertionTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Member1)) {
            return false;
        }
        Member1 other = (Member1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Member1[ id=" + id + " ]";
    }
    
}
