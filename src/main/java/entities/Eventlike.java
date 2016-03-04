/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "eventlike")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eventlike.findAll", query = "SELECT e FROM Eventlike e"),
    @NamedQuery(name = "Eventlike.findByEventlikeid", query = "SELECT e FROM Eventlike e WHERE e.eventlikeid = :eventlikeid"),
    @NamedQuery(name = "Eventlike.findByCreatedon", query = "SELECT e FROM Eventlike e WHERE e.createdon = :createdon"),
    @NamedQuery(name = "Eventlike.findByLiketype", query = "SELECT e FROM Eventlike e WHERE e.liketype = :liketype")})
public class Eventlike implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventlikeid")
    private Long eventlikeid;
    @Column(name = "createdon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdon;
    @Size(max = 255)
    @Column(name = "liketype")
    private String liketype;
    @JoinColumn(name = "eventid", referencedColumnName = "eventid")
    @ManyToOne
    private Event eventid;
    @JoinColumn(name = "memberid", referencedColumnName = "id")
    @ManyToOne
    private Member1 memberid;

    public Eventlike() {
    }

    public Eventlike(Long eventlikeid) {
        this.eventlikeid = eventlikeid;
    }

    public Long getEventlikeid() {
        return eventlikeid;
    }

    public void setEventlikeid(Long eventlikeid) {
        this.eventlikeid = eventlikeid;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getLiketype() {
        return liketype;
    }

    public void setLiketype(String liketype) {
        this.liketype = liketype;
    }

    public Event getEventid() {
        return eventid;
    }

    public void setEventid(Event eventid) {
        this.eventid = eventid;
    }

    public Member1 getMemberid() {
        return memberid;
    }

    public void setMemberid(Member1 memberid) {
        this.memberid = memberid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventlikeid != null ? eventlikeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventlike)) {
            return false;
        }
        Eventlike other = (Eventlike) object;
        if ((this.eventlikeid == null && other.eventlikeid != null) || (this.eventlikeid != null && !this.eventlikeid.equals(other.eventlikeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Eventlike[ eventlikeid=" + eventlikeid + " ]";
    }
    
}
