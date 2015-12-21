/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fjvb.nl.paardenvriendjes2018;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "MEMBER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Member.findAll", query = "SELECT m FROM Member m"),
    @NamedQuery(name = "Member.findByMemberId", query = "SELECT m FROM Member m WHERE m.memberId = :memberId"),
    @NamedQuery(name = "Member.findByAchternaam", query = "SELECT m FROM Member m WHERE m.achternaam = :achternaam"),
    @NamedQuery(name = "Member.findByDressuur", query = "SELECT m FROM Member m WHERE m.dressuur = :dressuur"),
    @NamedQuery(name = "Member.findByEventing", query = "SELECT m FROM Member m WHERE m.eventing = :eventing"),
    @NamedQuery(name = "Member.findByFokken", query = "SELECT m FROM Member m WHERE m.fokken = :fokken"),
    @NamedQuery(name = "Member.findByGeboortedatum", query = "SELECT m FROM Member m WHERE m.geboortedatum = :geboortedatum"),
    @NamedQuery(name = "Member.findByInEnVerkoop", query = "SELECT m FROM Member m WHERE m.inEnVerkoop = :inEnVerkoop"),
    @NamedQuery(name = "Member.findByMennen", query = "SELECT m FROM Member m WHERE m.mennen = :mennen"),
    @NamedQuery(name = "Member.findByNaturalHorsemanship", query = "SELECT m FROM Member m WHERE m.naturalHorsemanship = :naturalHorsemanship"),
    @NamedQuery(name = "Member.findByPaard1", query = "SELECT m FROM Member m WHERE m.paard1 = :paard1"),
    @NamedQuery(name = "Member.findByPaard10", query = "SELECT m FROM Member m WHERE m.paard10 = :paard10"),
    @NamedQuery(name = "Member.findByPaard10Reference", query = "SELECT m FROM Member m WHERE m.paard10Reference = :paard10Reference"),
    @NamedQuery(name = "Member.findByPaard2", query = "SELECT m FROM Member m WHERE m.paard2 = :paard2"),
    @NamedQuery(name = "Member.findByPaard2Reference", query = "SELECT m FROM Member m WHERE m.paard2Reference = :paard2Reference"),
    @NamedQuery(name = "Member.findByPaard3", query = "SELECT m FROM Member m WHERE m.paard3 = :paard3"),
    @NamedQuery(name = "Member.findByPaard3Reference", query = "SELECT m FROM Member m WHERE m.paard3Reference = :paard3Reference"),
    @NamedQuery(name = "Member.findByPaard4", query = "SELECT m FROM Member m WHERE m.paard4 = :paard4"),
    @NamedQuery(name = "Member.findByPaard4Reference", query = "SELECT m FROM Member m WHERE m.paard4Reference = :paard4Reference"),
    @NamedQuery(name = "Member.findByPaard5", query = "SELECT m FROM Member m WHERE m.paard5 = :paard5"),
    @NamedQuery(name = "Member.findByPaard5Reference", query = "SELECT m FROM Member m WHERE m.paard5Reference = :paard5Reference"),
    @NamedQuery(name = "Member.findByPaard6", query = "SELECT m FROM Member m WHERE m.paard6 = :paard6"),
    @NamedQuery(name = "Member.findByPaard6Reference", query = "SELECT m FROM Member m WHERE m.paard6Reference = :paard6Reference"),
    @NamedQuery(name = "Member.findByPaard7", query = "SELECT m FROM Member m WHERE m.paard7 = :paard7"),
    @NamedQuery(name = "Member.findByPaard7Reference", query = "SELECT m FROM Member m WHERE m.paard7Reference = :paard7Reference"),
    @NamedQuery(name = "Member.findByPaard8", query = "SELECT m FROM Member m WHERE m.paard8 = :paard8"),
    @NamedQuery(name = "Member.findByPaard8Reference", query = "SELECT m FROM Member m WHERE m.paard8Reference = :paard8Reference"),
    @NamedQuery(name = "Member.findByPaard9", query = "SELECT m FROM Member m WHERE m.paard9 = :paard9"),
    @NamedQuery(name = "Member.findByPaard9Reference", query = "SELECT m FROM Member m WHERE m.paard9Reference = :paard9Reference"),
    @NamedQuery(name = "Member.findByPaardReference", query = "SELECT m FROM Member m WHERE m.paardReference = :paardReference"),
    @NamedQuery(name = "Member.findByPaardenTrainen", query = "SELECT m FROM Member m WHERE m.paardenTrainen = :paardenTrainen"),
    @NamedQuery(name = "Member.findByPaardenVerzorgen", query = "SELECT m FROM Member m WHERE m.paardenVerzorgen = :paardenVerzorgen"),
    @NamedQuery(name = "Member.findByPassword", query = "SELECT m FROM Member m WHERE m.password = :password"),
    @NamedQuery(name = "Member.findByPlaatsnamen", query = "SELECT m FROM Member m WHERE m.plaatsnamen = :plaatsnamen"),
    @NamedQuery(name = "Member.findByPolo", query = "SELECT m FROM Member m WHERE m.polo = :polo"),
    @NamedQuery(name = "Member.findByRijdenLocatie", query = "SELECT m FROM Member m WHERE m.rijdenLocatie = :rijdenLocatie"),
    @NamedQuery(name = "Member.findBySamenTrainen", query = "SELECT m FROM Member m WHERE m.samenTrainen = :samenTrainen"),
    @NamedQuery(name = "Member.findByShowrijden", query = "SELECT m FROM Member m WHERE m.showrijden = :showrijden"),
    @NamedQuery(name = "Member.findBySportKlasse", query = "SELECT m FROM Member m WHERE m.sportKlasse = :sportKlasse"),
    @NamedQuery(name = "Member.findBySpringen", query = "SELECT m FROM Member m WHERE m.springen = :springen"),
    @NamedQuery(name = "Member.findByVoedingGezondheid", query = "SELECT m FROM Member m WHERE m.voedingGezondheid = :voedingGezondheid"),
    @NamedQuery(name = "Member.findByVoltige", query = "SELECT m FROM Member m WHERE m.voltige = :voltige"),
    @NamedQuery(name = "Member.findByVoorlichting", query = "SELECT m FROM Member m WHERE m.voorlichting = :voorlichting"),
    @NamedQuery(name = "Member.findByVoornaam", query = "SELECT m FROM Member m WHERE m.voornaam = :voornaam"),
    @NamedQuery(name = "Member.findByWestern", query = "SELECT m FROM Member m WHERE m.western = :western")})
public class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MEMBER_ID")
    private Long memberId;
    @Size(max = 255)
    @Column(name = "ACHTERNAAM")
    private String achternaam;
    @Column(name = "DRESSUUR")
    private Short dressuur;
    @Column(name = "EVENTING")
    private Short eventing;
    @Column(name = "FOKKEN")
    private Short fokken;
    @Column(name = "GEBOORTEDATUM")
    @Temporal(TemporalType.DATE)
    private Date geboortedatum;
    @Column(name = "IN_EN_VERKOOP")
    private Short inEnVerkoop;
    @Lob
    @Column(name = "INPUTEMAIL13")
    private String inputemail13;
    @Column(name = "MENNEN")
    private Short mennen;
    @Column(name = "NATURAL_HORSEMANSHIP")
    private Short naturalHorsemanship;
    @Lob
    @Column(name = "OVER_MIJ")
    private String overMij;
    @Size(max = 255)
    @Column(name = "PAARD_1")
    private String paard1;
    @Size(max = 255)
    @Column(name = "PAARD_10")
    private String paard10;
    @Column(name = "PAARD_10_REFERENCE")
    private Integer paard10Reference;
    @Size(max = 255)
    @Column(name = "PAARD_2")
    private String paard2;
    @Column(name = "PAARD_2_REFERENCE")
    private Integer paard2Reference;
    @Size(max = 255)
    @Column(name = "PAARD_3")
    private String paard3;
    @Column(name = "PAARD_3_REFERENCE")
    private Integer paard3Reference;
    @Size(max = 255)
    @Column(name = "PAARD_4")
    private String paard4;
    @Column(name = "PAARD_4_REFERENCE")
    private Integer paard4Reference;
    @Size(max = 255)
    @Column(name = "PAARD_5")
    private String paard5;
    @Column(name = "PAARD_5_REFERENCE")
    private Integer paard5Reference;
    @Size(max = 255)
    @Column(name = "PAARD_6")
    private String paard6;
    @Column(name = "PAARD_6_REFERENCE")
    private Integer paard6Reference;
    @Size(max = 255)
    @Column(name = "PAARD_7")
    private String paard7;
    @Column(name = "PAARD_7_REFERENCE")
    private Integer paard7Reference;
    @Size(max = 255)
    @Column(name = "PAARD_8")
    private String paard8;
    @Column(name = "PAARD_8_REFERENCE")
    private Integer paard8Reference;
    @Size(max = 255)
    @Column(name = "PAARD_9")
    private String paard9;
    @Column(name = "PAARD_9_REFERENCE")
    private Integer paard9Reference;
    @Column(name = "PAARD_REFERENCE")
    private Integer paardReference;
    @Column(name = "PAARDEN_TRAINEN")
    private Short paardenTrainen;
    @Column(name = "PAARDEN_VERZORGEN")
    private Short paardenVerzorgen;
    @Size(max = 255)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 255)
    @Column(name = "PLAATSNAMEN")
    private String plaatsnamen;
    @Column(name = "POLO")
    private Short polo;
    @Column(name = "RIJDEN_LOCATIE")
    private Short rijdenLocatie;
    @Column(name = "SAMEN_TRAINEN")
    private Short samenTrainen;
    @Column(name = "SHOWRIJDEN")
    private Short showrijden;
    @Size(max = 255)
    @Column(name = "SPORT_KLASSE")
    private String sportKlasse;
    @Column(name = "SPRINGEN")
    private Short springen;
    @Column(name = "VOEDING_GEZONDHEID")
    private Short voedingGezondheid;
    @Column(name = "VOLTIGE")
    private Short voltige;
    @Column(name = "VOORLICHTING")
    private Short voorlichting;
    @Size(max = 255)
    @Column(name = "VOORNAAM")
    private String voornaam;
    @Column(name = "WESTERN")
    private Short western;

    public Member() {
    }

    public Member(Long memberId) {
        this.memberId = memberId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Short getDressuur() {
        return dressuur;
    }

    public void setDressuur(Short dressuur) {
        this.dressuur = dressuur;
    }

    public Short getEventing() {
        return eventing;
    }

    public void setEventing(Short eventing) {
        this.eventing = eventing;
    }

    public Short getFokken() {
        return fokken;
    }

    public void setFokken(Short fokken) {
        this.fokken = fokken;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public Short getInEnVerkoop() {
        return inEnVerkoop;
    }

    public void setInEnVerkoop(Short inEnVerkoop) {
        this.inEnVerkoop = inEnVerkoop;
    }

    public String getInputemail13() {
        return inputemail13;
    }

    public void setInputemail13(String inputemail13) {
        this.inputemail13 = inputemail13;
    }

    public Short getMennen() {
        return mennen;
    }

    public void setMennen(Short mennen) {
        this.mennen = mennen;
    }

    public Short getNaturalHorsemanship() {
        return naturalHorsemanship;
    }

    public void setNaturalHorsemanship(Short naturalHorsemanship) {
        this.naturalHorsemanship = naturalHorsemanship;
    }

    public String getOverMij() {
        return overMij;
    }

    public void setOverMij(String overMij) {
        this.overMij = overMij;
    }

    public String getPaard1() {
        return paard1;
    }

    public void setPaard1(String paard1) {
        this.paard1 = paard1;
    }

    public String getPaard10() {
        return paard10;
    }

    public void setPaard10(String paard10) {
        this.paard10 = paard10;
    }

    public Integer getPaard10Reference() {
        return paard10Reference;
    }

    public void setPaard10Reference(Integer paard10Reference) {
        this.paard10Reference = paard10Reference;
    }

    public String getPaard2() {
        return paard2;
    }

    public void setPaard2(String paard2) {
        this.paard2 = paard2;
    }

    public Integer getPaard2Reference() {
        return paard2Reference;
    }

    public void setPaard2Reference(Integer paard2Reference) {
        this.paard2Reference = paard2Reference;
    }

    public String getPaard3() {
        return paard3;
    }

    public void setPaard3(String paard3) {
        this.paard3 = paard3;
    }

    public Integer getPaard3Reference() {
        return paard3Reference;
    }

    public void setPaard3Reference(Integer paard3Reference) {
        this.paard3Reference = paard3Reference;
    }

    public String getPaard4() {
        return paard4;
    }

    public void setPaard4(String paard4) {
        this.paard4 = paard4;
    }

    public Integer getPaard4Reference() {
        return paard4Reference;
    }

    public void setPaard4Reference(Integer paard4Reference) {
        this.paard4Reference = paard4Reference;
    }

    public String getPaard5() {
        return paard5;
    }

    public void setPaard5(String paard5) {
        this.paard5 = paard5;
    }

    public Integer getPaard5Reference() {
        return paard5Reference;
    }

    public void setPaard5Reference(Integer paard5Reference) {
        this.paard5Reference = paard5Reference;
    }

    public String getPaard6() {
        return paard6;
    }

    public void setPaard6(String paard6) {
        this.paard6 = paard6;
    }

    public Integer getPaard6Reference() {
        return paard6Reference;
    }

    public void setPaard6Reference(Integer paard6Reference) {
        this.paard6Reference = paard6Reference;
    }

    public String getPaard7() {
        return paard7;
    }

    public void setPaard7(String paard7) {
        this.paard7 = paard7;
    }

    public Integer getPaard7Reference() {
        return paard7Reference;
    }

    public void setPaard7Reference(Integer paard7Reference) {
        this.paard7Reference = paard7Reference;
    }

    public String getPaard8() {
        return paard8;
    }

    public void setPaard8(String paard8) {
        this.paard8 = paard8;
    }

    public Integer getPaard8Reference() {
        return paard8Reference;
    }

    public void setPaard8Reference(Integer paard8Reference) {
        this.paard8Reference = paard8Reference;
    }

    public String getPaard9() {
        return paard9;
    }

    public void setPaard9(String paard9) {
        this.paard9 = paard9;
    }

    public Integer getPaard9Reference() {
        return paard9Reference;
    }

    public void setPaard9Reference(Integer paard9Reference) {
        this.paard9Reference = paard9Reference;
    }

    public Integer getPaardReference() {
        return paardReference;
    }

    public void setPaardReference(Integer paardReference) {
        this.paardReference = paardReference;
    }

    public Short getPaardenTrainen() {
        return paardenTrainen;
    }

    public void setPaardenTrainen(Short paardenTrainen) {
        this.paardenTrainen = paardenTrainen;
    }

    public Short getPaardenVerzorgen() {
        return paardenVerzorgen;
    }

    public void setPaardenVerzorgen(Short paardenVerzorgen) {
        this.paardenVerzorgen = paardenVerzorgen;
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

    public Short getPolo() {
        return polo;
    }

    public void setPolo(Short polo) {
        this.polo = polo;
    }

    public Short getRijdenLocatie() {
        return rijdenLocatie;
    }

    public void setRijdenLocatie(Short rijdenLocatie) {
        this.rijdenLocatie = rijdenLocatie;
    }

    public Short getSamenTrainen() {
        return samenTrainen;
    }

    public void setSamenTrainen(Short samenTrainen) {
        this.samenTrainen = samenTrainen;
    }

    public Short getShowrijden() {
        return showrijden;
    }

    public void setShowrijden(Short showrijden) {
        this.showrijden = showrijden;
    }

    public String getSportKlasse() {
        return sportKlasse;
    }

    public void setSportKlasse(String sportKlasse) {
        this.sportKlasse = sportKlasse;
    }

    public Short getSpringen() {
        return springen;
    }

    public void setSpringen(Short springen) {
        this.springen = springen;
    }

    public Short getVoedingGezondheid() {
        return voedingGezondheid;
    }

    public void setVoedingGezondheid(Short voedingGezondheid) {
        this.voedingGezondheid = voedingGezondheid;
    }

    public Short getVoltige() {
        return voltige;
    }

    public void setVoltige(Short voltige) {
        this.voltige = voltige;
    }

    public Short getVoorlichting() {
        return voorlichting;
    }

    public void setVoorlichting(Short voorlichting) {
        this.voorlichting = voorlichting;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Short getWestern() {
        return western;
    }

    public void setWestern(Short western) {
        this.western = western;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberId != null ? memberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Member)) {
            return false;
        }
        Member other = (Member) object;
        if ((this.memberId == null && other.memberId != null) || (this.memberId != null && !this.memberId.equals(other.memberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fjvb.nl.paardenvriendjes2018.Member[ memberId=" + memberId + " ]";
    }
    
}
