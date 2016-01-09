package fjvb.nl.paardenvriendjes2018;

import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gebruiker
 */
@Entity
@XmlRootElement
public class Member implements Serializable {
    private static long serialVersionUID = 1L;
    public static final String PROP_SERIALVERSIONUID = "PROP_SERIALVERSIONUID";
    public static final String PROP_ID = "PROP_ID";
    public static final String PROP_ACHTERNAAM = "PROP_ACHTERNAAM";
    public static final String PROP_BUITENRITTEN = "PROP_BUITENRITTEN";
    public static final String PROP_DRAFSPORT = "PROP_DRAFSPORT";
    public static final String PROP_DRESSUUR = "PROP_DRESSUUR";
    public static final String PROP_ENDURANCE = "PROP_ENDURANCE";
    public static final String PROP_EVENTING = "PROP_EVENTING";
    public static final String PROP_FOKKEN = "PROP_FOKKEN";
    public static final String PROP_GEBOORTEDATUM = "PROP_GEBOORTEDATUM";
    public static final String PROP_INENVERKOOP = "PROP_INENVERKOOP";
    public static final String PROP_INPUTEMAIL13 = "PROP_INPUTEMAIL13";
    public static final String PROP_MEMBERID = "PROP_MEMBERID";
    public static final String PROP_MENNEN = "PROP_MENNEN";
    public static final String PROP_NATURALHORSEMANSHIP = "PROP_NATURALHORSEMANSHIP";
    public static final String PROP_OVERMIJ = "PROP_OVERMIJ";
    public static final String PROP_PAARD1 = "PROP_PAARD1";
    public static final String PROP_PAARD2 = "PROP_PAARD2";
    public static final String PROP_PAARD3 = "PROP_PAARD3";
    public static final String PROP_PAARD4 = "PROP_PAARD4";
    public static final String PROP_PAARD5 = "PROP_PAARD5";
    public static final String PROP_PAARD6 = "PROP_PAARD6";
    public static final String PROP_PAARD7 = "PROP_PAARD7";
    public static final String PROP_PAARD8 = "PROP_PAARD8";
    public static final String PROP_PAARD9 = "PROP_PAARD9";
    public static final String PROP_PAARD10 = "PROP_PAARD10";
    public static final String PROP_PAARDENTRAINEN = "PROP_PAARDENTRAINEN";
    public static final String PROP_PAARDENVERZORGEN = "PROP_PAARDENVERZORGEN";
    public static final String PROP_PASSWORD = "PROP_PASSWORD";
    public static final String PROP_PLAATSNAMEN = "PROP_PLAATSNAMEN";
    public static final String PROP_POLO = "PROP_POLO";
    public static final String PROP_RENSPORT = "PROP_RENSPORT";
    public static final String PROP_RIJDENLOCATIE = "PROP_RIJDENLOCATIE";
    public static final String PROP_RINGSTEKEN = "PROP_RINGSTEKEN";
    public static final String PROP_RODEO = "PROP_RODEO";
    public static final String PROP_SAMENTRAINEN = "PROP_SAMENTRAINEN";
    public static final String PROP_SHOWRIJDEN = "PROP_SHOWRIJDEN";
    public static final String PROP_SPRINGEN = "PROP_SPRINGEN";
    public static final String PROP_VOEDINGGEZONDHEID = "PROP_VOEDINGGEZONDHEID";
    public static final String PROP_VOLTIGE = "PROP_VOLTIGE";
    public static final String PROP_VOORLICHTING = "PROP_VOORLICHTING";
    public static final String PROP_VOORNAAM = "PROP_VOORNAAM";
    public static final String PROP_VOSSENJACHT = "PROP_VOSSENJACHT";
    public static final String PROP_WEDSTRIJDSPORT = "PROP_WEDSTRIJDSPORT";
    public static final String PROP_WESTERN = "PROP_WESTERN";

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
private Long id;
private String achternaam;
private Boolean buitenritten;
private Boolean drafsport;
private Boolean dressuur;
private Boolean endurance;
private Boolean eventing;
private Boolean fokken;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date geboortedatum;
private Boolean inEnVerkoop;
private String inputemail13;
private Long memberId;
private Boolean mennen;
private Boolean naturalHorsemanship;
private String overMij;
private String paard1;
private String paard2;
private String paard3;
private String paard4;
private String paard5;
private String paard6;
private String paard7;
private String paard8;
private String paard9;
private String paard10;
private Boolean paardenTrainen;
private Boolean paardenVerzorgen;
private String password;
private String plaatsnamen;
private Boolean polo;
private Boolean rensport;
private Boolean rijdenLocatie;
private Boolean ringsteken;
private Boolean rodeo;
private Boolean samenTrainen;
private Boolean showrijden;
private Boolean springen;
private Boolean voedingGezondheid;
private Boolean voltige;
private Boolean voorlichting;
private String voornaam;
private Boolean vossenjacht;
private Boolean wedstrijdsport;
private Boolean western;    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    private final transient VetoableChangeSupport vetoableChangeSupport = new java.beans.VetoableChangeSupport(this);
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Member)) {
            return false;
        }
        Member other = (Member) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fjvb.nl.paardenvriendjes2018.Member[ id=" + getId() + " ]";
    }

    /**
     * @return the achternaam
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     * @param achternaam the achternaam to set
     */
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    /**
     * @return the buitenritten
     */
    public Boolean getBuitenritten() {
        return buitenritten;
    }

    /**
     * @param buitenritten the buitenritten to set
     */
    public void setBuitenritten(Boolean buitenritten) {
        this.buitenritten = buitenritten;
    }

    /**
     * @return the drafsport
     */
    public Boolean getDrafsport() {
        return drafsport;
    }

    /**
     * @param drafsport the drafsport to set
     */
    public void setDrafsport(Boolean drafsport) {
        this.drafsport = drafsport;
    }

    /**
     * @return the dressuur
     */
    public Boolean getDressuur() {
        return dressuur;
    }

    /**
     * @param dressuur the dressuur to set
     */
    public void setDressuur(Boolean dressuur) {
        this.dressuur = dressuur;
    }

    /**
     * @return the endurance
     */
    public Boolean getEndurance() {
        return endurance;
    }

    /**
     * @param endurance the endurance to set
     */
    public void setEndurance(Boolean endurance) {
        this.endurance = endurance;
    }

    /**
     * @return the eventing
     */
    public Boolean getEventing() {
        return eventing;
    }

    /**
     * @param eventing the eventing to set
     */
    public void setEventing(Boolean eventing) {
        this.eventing = eventing;
    }

    /**
     * @return the fokken
     */
    public Boolean getFokken() {
        return fokken;
    }

    /**
     * @param fokken the fokken to set
     */
    public void setFokken(Boolean fokken) {
        this.fokken = fokken;
    }

    /**
     * @return the geboortedatum
     */
    public Date getGeboortedatum() {
        return geboortedatum;
    }

    /**
     * @param geboortedatum the geboortedatum to set
     */
    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    /**
     * @return the inEnVerkoop
     */
    public Boolean getInEnVerkoop() {
        return inEnVerkoop;
    }

    /**
     * @param inEnVerkoop the inEnVerkoop to set
     */
    public void setInEnVerkoop(Boolean inEnVerkoop) {
        this.inEnVerkoop = inEnVerkoop;
    }

    /**
     * @return the inputemail13
     */
    public String getInputemail13() {
        return inputemail13;
    }

    /**
     * @param inputemail13 the inputemail13 to set
     */
    public void setInputemail13(String inputemail13) {
        this.inputemail13 = inputemail13;
    }

    /**
     * @return the memberId
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the mennen
     */
    public Boolean getMennen() {
        return mennen;
    }

    /**
     * @param mennen the mennen to set
     */
    public void setMennen(Boolean mennen) {
        this.mennen = mennen;
    }

    /**
     * @return the naturalHorsemanship
     */
    public Boolean getNaturalHorsemanship() {
        return naturalHorsemanship;
    }

    /**
     * @param naturalHorsemanship the naturalHorsemanship to set
     */
    public void setNaturalHorsemanship(Boolean naturalHorsemanship) {
        this.naturalHorsemanship = naturalHorsemanship;
    }

    /**
     * @return the overMij
     */
    public String getOverMij() {
        return overMij;
    }

    /**
     * @param overMij the overMij to set
     */
    public void setOverMij(String overMij) {
        this.overMij = overMij;
    }

    /**
     * @return the paard1
     */
    public String getPaard1() {
        return paard1;
    }

    /**
     * @param paard1 the paard1 to set
     */
    public void setPaard1(String paard1) {
        this.paard1 = paard1;
    }

    /**
     * @return the paard2
     */
    public String getPaard2() {
        return paard2;
    }

    /**
     * @param paard2 the paard2 to set
     */
    public void setPaard2(String paard2) {
        this.paard2 = paard2;
    }

    /**
     * @return the paard3
     */
    public String getPaard3() {
        return paard3;
    }

    /**
     * @param paard3 the paard3 to set
     */
    public void setPaard3(String paard3) {
        this.paard3 = paard3;
    }

    /**
     * @return the paard4
     */
    public String getPaard4() {
        return paard4;
    }

    /**
     * @param paard4 the paard4 to set
     */
    public void setPaard4(String paard4) {
        this.paard4 = paard4;
    }

    /**
     * @return the paard5
     */
    public String getPaard5() {
        return paard5;
    }

    /**
     * @param paard5 the paard5 to set
     */
    public void setPaard5(String paard5) {
        this.paard5 = paard5;
    }

    /**
     * @return the paard6
     */
    public String getPaard6() {
        return paard6;
    }

    /**
     * @param paard6 the paard6 to set
     */
    public void setPaard6(String paard6) {
        this.paard6 = paard6;
    }

    /**
     * @return the paard7
     */
    public String getPaard7() {
        return paard7;
    }

    /**
     * @param paard7 the paard7 to set
     */
    public void setPaard7(String paard7) {
        this.paard7 = paard7;
    }

    /**
     * @return the paard8
     */
    public String getPaard8() {
        return paard8;
    }

    /**
     * @param paard8 the paard8 to set
     */
    public void setPaard8(String paard8) {
        this.paard8 = paard8;
    }

    /**
     * @return the paard9
     */
    public String getPaard9() {
        return paard9;
    }

    /**
     * @param paard9 the paard9 to set
     */
    public void setPaard9(String paard9) {
        this.paard9 = paard9;
    }

    /**
     * @return the paard10
     */
    public String getPaard10() {
        return paard10;
    }

    /**
     * @param paard10 the paard10 to set
     */
    public void setPaard10(String paard10) {
        this.paard10 = paard10;
    }

    /**
     * @return the paardenTrainen
     */
    public Boolean getPaardenTrainen() {
        return paardenTrainen;
    }

    /**
     * @param paardenTrainen the paardenTrainen to set
     */
    public void setPaardenTrainen(Boolean paardenTrainen) {
        this.paardenTrainen = paardenTrainen;
    }

    /**
     * @return the paardenVerzorgen
     */
    public Boolean getPaardenVerzorgen() {
        return paardenVerzorgen;
    }

    /**
     * @param paardenVerzorgen the paardenVerzorgen to set
     */
    public void setPaardenVerzorgen(Boolean paardenVerzorgen) {
        this.paardenVerzorgen = paardenVerzorgen;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the plaatsnamen
     */
    public String getPlaatsnamen() {
        return plaatsnamen;
    }

    /**
     * @param plaatsnamen the plaatsnamen to set
     */
    public void setPlaatsnamen(String plaatsnamen) {
        this.plaatsnamen = plaatsnamen;
    }

    /**
     * @return the polo
     */
    public Boolean getPolo() {
        return polo;
    }

    /**
     * @param polo the polo to set
     */
    public void setPolo(Boolean polo) {
        this.polo = polo;
    }

    /**
     * @return the rensport
     */
    public Boolean getRensport() {
        return rensport;
    }

    /**
     * @param rensport the rensport to set
     */
    public void setRensport(Boolean rensport) {
        this.rensport = rensport;
    }

    /**
     * @return the rijdenLocatie
     */
    public Boolean getRijdenLocatie() {
        return rijdenLocatie;
    }

    /**
     * @param rijdenLocatie the rijdenLocatie to set
     */
    public void setRijdenLocatie(Boolean rijdenLocatie) {
        this.rijdenLocatie = rijdenLocatie;
    }

    /**
     * @return the ringsteken
     */
    public Boolean getRingsteken() {
        return ringsteken;
    }

    /**
     * @param ringsteken the ringsteken to set
     */
    public void setRingsteken(Boolean ringsteken) {
        this.ringsteken = ringsteken;
    }

    /**
     * @return the rodeo
     */
    public Boolean getRodeo() {
        return rodeo;
    }

    /**
     * @param rodeo the rodeo to set
     */
    public void setRodeo(Boolean rodeo) {
        this.rodeo = rodeo;
    }

    /**
     * @return the samenTrainen
     */
    public Boolean getSamenTrainen() {
        return samenTrainen;
    }

    /**
     * @param samenTrainen the samenTrainen to set
     */
    public void setSamenTrainen(Boolean samenTrainen) {
        this.samenTrainen = samenTrainen;
    }

    /**
     * @return the showrijden
     */
    public Boolean getShowrijden() {
        return showrijden;
    }

    /**
     * @param showrijden the showrijden to set
     */
    public void setShowrijden(Boolean showrijden) {
        this.showrijden = showrijden;
    }

    /**
     * @return the springen
     */
    public Boolean getSpringen() {
        return springen;
    }

    /**
     * @param springen the springen to set
     */
    public void setSpringen(Boolean springen) {
        this.springen = springen;
    }

    /**
     * @return the voedingGezondheid
     */
    public Boolean getVoedingGezondheid() {
        return voedingGezondheid;
    }

    /**
     * @param voedingGezondheid the voedingGezondheid to set
     */
    public void setVoedingGezondheid(Boolean voedingGezondheid) {
        this.voedingGezondheid = voedingGezondheid;
    }

    /**
     * @return the voltige
     */
    public Boolean getVoltige() {
        return voltige;
    }

    /**
     * @param voltige the voltige to set
     */
    public void setVoltige(Boolean voltige) {
        this.voltige = voltige;
    }

    /**
     * @return the voorlichting
     */
    public Boolean getVoorlichting() {
        return voorlichting;
    }

    /**
     * @param voorlichting the voorlichting to set
     */
    public void setVoorlichting(Boolean voorlichting) {
        this.voorlichting = voorlichting;
    }

    /**
     * @return the voornaam
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * @param voornaam the voornaam to set
     */
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     * @return the vossenjacht
     */
    public Boolean getVossenjacht() {
        return vossenjacht;
    }

    /**
     * @param vossenjacht the vossenjacht to set
     */
    public void setVossenjacht(Boolean vossenjacht) {
        this.vossenjacht = vossenjacht;
    }

    /**
     * @return the wedstrijdsport
     */
    public Boolean getWedstrijdsport() {
        return wedstrijdsport;
    }

    /**
     * @param wedstrijdsport the wedstrijdsport to set
     */
    public void setWedstrijdsport(Boolean wedstrijdsport) {
        this.wedstrijdsport = wedstrijdsport;
    }

    /**
     * @return the western
     */
    public Boolean getWestern() {
        return western;
    }

    /**
     * @param western the western to set
     */
    public void setWestern(Boolean western) {
        this.western = western;
    }
    
}
