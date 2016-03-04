/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Gebruiker
 */
@Entity
@Table(name = "event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e"),
    @NamedQuery(name = "Event.findByEventid", query = "SELECT e FROM Event e WHERE e.eventid = :eventid"),
    @NamedQuery(name = "Event.findByComments", query = "SELECT e FROM Event e WHERE e.comments = :comments"),
    @NamedQuery(name = "Event.findByCreatedon", query = "SELECT e FROM Event e WHERE e.createdon = :createdon"),
    @NamedQuery(name = "Event.findByEventdate", query = "SELECT e FROM Event e WHERE e.eventdate = :eventdate"),
    @NamedQuery(name = "Event.findByEventimage", query = "SELECT e FROM Event e WHERE e.eventimage = :eventimage"),
    @NamedQuery(name = "Event.findByEventname", query = "SELECT e FROM Event e WHERE e.eventname = :eventname"),
    @NamedQuery(name = "Event.findByEventplace", query = "SELECT e FROM Event e WHERE e.eventplace = :eventplace"),
    @NamedQuery(name = "Event.findByImage1", query = "SELECT e FROM Event e WHERE e.image1 = :image1"),
    @NamedQuery(name = "Event.findByImage2", query = "SELECT e FROM Event e WHERE e.image2 = :image2"),
    @NamedQuery(name = "Event.findByImage3", query = "SELECT e FROM Event e WHERE e.image3 = :image3"),
    @NamedQuery(name = "Event.findByOnderdeel1", query = "SELECT e FROM Event e WHERE e.onderdeel1 = :onderdeel1"),
    @NamedQuery(name = "Event.findByOnderdeel2", query = "SELECT e FROM Event e WHERE e.onderdeel2 = :onderdeel2"),
    @NamedQuery(name = "Event.findByOnderdeel3", query = "SELECT e FROM Event e WHERE e.onderdeel3 = :onderdeel3"),
    @NamedQuery(name = "Event.findByPoints1", query = "SELECT e FROM Event e WHERE e.points1 = :points1"),
    @NamedQuery(name = "Event.findByPoints2", query = "SELECT e FROM Event e WHERE e.points2 = :points2"),
    @NamedQuery(name = "Event.findByPoints3", query = "SELECT e FROM Event e WHERE e.points3 = :points3"),
    @NamedQuery(name = "Event.findByRank1", query = "SELECT e FROM Event e WHERE e.rank1 = :rank1"),
    @NamedQuery(name = "Event.findByRank2", query = "SELECT e FROM Event e WHERE e.rank2 = :rank2"),
    @NamedQuery(name = "Event.findByRank3", query = "SELECT e FROM Event e WHERE e.rank3 = :rank3")})
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventid")
    private Long eventid;
    @Size(max = 255)
    @Column(name = "comments")
    private String comments;
    @Column(name = "createdon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdon;
    @Column(name = "eventdate")
    @Temporal(TemporalType.DATE)
    private Date eventdate;
    @Size(max = 255)
    @Column(name = "eventimage")
    private String eventimage;
    @Lob
    @Column(name = "eventmap")
    private byte[] eventmap;
    @Size(max = 255)
    @Column(name = "eventname")
    private String eventname;
    @Size(max = 255)
    @Column(name = "eventplace")
    private String eventplace;
    @Size(max = 255)
    @Column(name = "image1")
    private String image1;
    @Size(max = 255)
    @Column(name = "image2")
    private String image2;
    @Size(max = 255)
    @Column(name = "image3")
    private String image3;
    @Size(max = 255)
    @Column(name = "onderdeel1")
    private String onderdeel1;
    @Size(max = 255)
    @Column(name = "onderdeel2")
    private String onderdeel2;
    @Size(max = 255)
    @Column(name = "onderdeel3")
    private String onderdeel3;
    @Size(max = 255)
    @Column(name = "points1")
    private String points1;
    @Size(max = 255)
    @Column(name = "points2")
    private String points2;
    @Size(max = 255)
    @Column(name = "points3")
    private String points3;
    @Size(max = 255)
    @Column(name = "rank1")
    private String rank1;
    @Size(max = 255)
    @Column(name = "rank2")
    private String rank2;
    @Size(max = 255)
    @Column(name = "rank3")
    private String rank3;
    @OneToMany(mappedBy = "eventid")
    private Collection<Eventcomment> eventcommentCollection;
    @OneToMany(mappedBy = "ritid")
    private Collection<Ritcomment> ritcommentCollection;
    @OneToMany(mappedBy = "eventid")
    private Collection<Eventlike> eventlikeCollection;
    @JoinColumn(name = "horseid", referencedColumnName = "horseid")
    @ManyToOne
    private Horse horseid;
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;
    @OneToMany(mappedBy = "ritid")
    private Collection<Ritlike> ritlikeCollection;

    public Event() {
    }

    public Event(Long eventid) {
        this.eventid = eventid;
    }

    public Long getEventid() {
        return eventid;
    }

    public void setEventid(Long eventid) {
        this.eventid = eventid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Date getEventdate() {
        return eventdate;
    }

    public void setEventdate(Date eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventimage() {
        return eventimage;
    }

    public void setEventimage(String eventimage) {
        this.eventimage = eventimage;
    }

    public byte[] getEventmap() {
        return eventmap;
    }

    public void setEventmap(byte[] eventmap) {
        this.eventmap = eventmap;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getEventplace() {
        return eventplace;
    }

    public void setEventplace(String eventplace) {
        this.eventplace = eventplace;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getOnderdeel1() {
        return onderdeel1;
    }

    public void setOnderdeel1(String onderdeel1) {
        this.onderdeel1 = onderdeel1;
    }

    public String getOnderdeel2() {
        return onderdeel2;
    }

    public void setOnderdeel2(String onderdeel2) {
        this.onderdeel2 = onderdeel2;
    }

    public String getOnderdeel3() {
        return onderdeel3;
    }

    public void setOnderdeel3(String onderdeel3) {
        this.onderdeel3 = onderdeel3;
    }

    public String getPoints1() {
        return points1;
    }

    public void setPoints1(String points1) {
        this.points1 = points1;
    }

    public String getPoints2() {
        return points2;
    }

    public void setPoints2(String points2) {
        this.points2 = points2;
    }

    public String getPoints3() {
        return points3;
    }

    public void setPoints3(String points3) {
        this.points3 = points3;
    }

    public String getRank1() {
        return rank1;
    }

    public void setRank1(String rank1) {
        this.rank1 = rank1;
    }

    public String getRank2() {
        return rank2;
    }

    public void setRank2(String rank2) {
        this.rank2 = rank2;
    }

    public String getRank3() {
        return rank3;
    }

    public void setRank3(String rank3) {
        this.rank3 = rank3;
    }

    @XmlTransient
    public Collection<Eventcomment> getEventcommentCollection() {
        return eventcommentCollection;
    }

    public void setEventcommentCollection(Collection<Eventcomment> eventcommentCollection) {
        this.eventcommentCollection = eventcommentCollection;
    }

    @XmlTransient
    public Collection<Ritcomment> getRitcommentCollection() {
        return ritcommentCollection;
    }

    public void setRitcommentCollection(Collection<Ritcomment> ritcommentCollection) {
        this.ritcommentCollection = ritcommentCollection;
    }

    @XmlTransient
    public Collection<Eventlike> getEventlikeCollection() {
        return eventlikeCollection;
    }

    public void setEventlikeCollection(Collection<Eventlike> eventlikeCollection) {
        this.eventlikeCollection = eventlikeCollection;
    }

    public Horse getHorseid() {
        return horseid;
    }

    public void setHorseid(Horse horseid) {
        this.horseid = horseid;
    }

    public Member1 getMemberid() {
        return memberid;
    }

    public void setMemberid(Member1 memberid) {
        this.memberid = memberid;
    }

    @XmlTransient
    public Collection<Ritlike> getRitlikeCollection() {
        return ritlikeCollection;
    }

    public void setRitlikeCollection(Collection<Ritlike> ritlikeCollection) {
        this.ritlikeCollection = ritlikeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventid != null ? eventid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.eventid == null && other.eventid != null) || (this.eventid != null && !this.eventid.equals(other.eventid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Event[ eventid=" + eventid + " ]";
    }
    
}
