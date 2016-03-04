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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "friend")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Friend.findAll", query = "SELECT f FROM Friend f"),
    @NamedQuery(name = "Friend.findByFriendid", query = "SELECT f FROM Friend f WHERE f.friendid = :friendid"),
    @NamedQuery(name = "Friend.findByCreatedon", query = "SELECT f FROM Friend f WHERE f.createdon = :createdon"),
    @NamedQuery(name = "Friend.findByText", query = "SELECT f FROM Friend f WHERE f.text = :text")})
public class Friend implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "friendid")
    private Long friendid;
    @Column(name = "createdon")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdon;
    @Size(max = 255)
    @Column(name = "text")
    private String text;
    @JoinColumn(name = "friendid", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Member1 member1;

    public Friend() {
    }

    public Friend(Long friendid) {
        this.friendid = friendid;
    }

    public Long getFriendid() {
        return friendid;
    }

    public void setFriendid(Long friendid) {
        this.friendid = friendid;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Member1 getMember1() {
        return member1;
    }

    public void setMember1(Member1 member1) {
        this.member1 = member1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (friendid != null ? friendid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Friend)) {
            return false;
        }
        Friend other = (Friend) object;
        if ((this.friendid == null && other.friendid != null) || (this.friendid != null && !this.friendid.equals(other.friendid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Friend[ friendid=" + friendid + " ]";
    }
    
}
