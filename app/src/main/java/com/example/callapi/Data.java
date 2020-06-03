package com.example.callapi;

import java.util.List;

public class Data {


    /**
     * Id : {"UniqueId":"AAMkAGE3ODVjZDNjLWMwYzItNDdiYi04YTJkLTZjNzYwMzVjYjY5ZQBGAAAAAABl5oh+UZJcQ6BFhq07rC/ABwCjfoe+7F0xTaTl71gGBgwzAAAAEQe5AACjfoe+7F0xTaTl71gGBgwzAAAAEgw5AAA=","ChangeKey":"DwAAABYAAACjfoe+7F0xTaTl71gGBgwzAAAAEyaL"}
     * CalendarId : {"UniqueId":"AAMkAGFhZmEyOGQxLWQwNzQtNDk4Yy1iYTU5LWM3ZmU0ZDNiODAxNQBGAAAAAADCxZciDUbqSZpNgcWgVNZXBwDueoltASkpR60aWx8ZQ2BPAAAAYiToAADMRnUI48sXTrKToiB5tITSAAAMx4bmAAA=","ChangeKey":"DwAAABYAAADMRnUI48sXTrKToiB5tITSAAAMwkDZ"}
     * Subject : Test meeting 01
     * Start : 2020-05-26T08:30:00Z
     * End : 2020-05-26T09:30:00Z
     * Location : Room 001
     * Name : Mr John
     * Address : test@gmail.com
     * Body : Lorem ipsum dolor sit amet, eu his praesent efficiantur, eos dicta vocibus philosophia ex,cuato morum signiferumque mel. Saperet quaestio interpretaris vel ne Partem repudiandae ad vis. Has detraxit legendos id, mea atqui iuvaret te.
     * StatusChecked : 1
     * Meetings : [{"Id":"5ec333db42000842ec80f616","Room":"Room 01","Project":"Room1","Status":2,"Email":"test@gmail.com","Appointment":{"Id":{"UniqueId":"AAMkAGE3ODVjZDNjLWMwYzItNDdiYi04YTJkLTZjNzYwMzVjYjY5ZQBGAAAAAABl5oh+UZJcQ6BFhq07rC/ABwCjfoe+7F0xTaTl71gGBgwzAAAAEQe5AACjfoe+7F0xTaTl71gGBgwzAAAAEgw5AAA=","ChangeKey":null},"Location":"Room 01","Subject":"Test meeting 01","Start":"2020-05-26T08:30:00Z","End":"2020-05-26T09:30:00Z"}}]
     * Invites : ["test1@gmail.com","test2@gmail.com"]
     * RequiredAttendees : [{"Name":"test1@gmail.com","Address":"test1@gmail.com","RoutingType":"SMTP","MailboxType":"OneOff","_id":null}]
     * OptionalAttendees : []
     * Resources : [{"Name":"Room 01","Address":"room01@gmail.com","RoutingType":null,"MailboxType":null,"_id":null}]
     */

    private IdBean Id;
    private CalendarIdBean CalendarId;
    private String Subject;
    private String Start;
    private String End;
    private String Location;
    private String Name;
    private String Address;
    private String Body;
    private int StatusChecked;
    private List<MeetingsBean> Meetings;
    private List<String> Invites;
    private List<RequiredAttendeesBean> RequiredAttendees;
    private List<?> OptionalAttendees;
    private List<ResourcesBean> Resources;

    public IdBean getId() {
        return Id;
    }

    public void setId(IdBean Id) {
        this.Id = Id;
    }

    public CalendarIdBean getCalendarId() {
        return CalendarId;
    }

    public void setCalendarId(CalendarIdBean CalendarId) {
        this.CalendarId = CalendarId;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getStart() {
        return Start;
    }

    public void setStart(String Start) {
        this.Start = Start;
    }

    public String getEnd() {
        return End;
    }

    public void setEnd(String End) {
        this.End = End;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String Body) {
        this.Body = Body;
    }

    public int getStatusChecked() {
        return StatusChecked;
    }

    public void setStatusChecked(int StatusChecked) {
        this.StatusChecked = StatusChecked;
    }

    public List<MeetingsBean> getMeetings() {
        return Meetings;
    }

    public void setMeetings(List<MeetingsBean> Meetings) {
        this.Meetings = Meetings;
    }

    public List<String> getInvites() {
        return Invites;
    }

    public void setInvites(List<String> Invites) {
        this.Invites = Invites;
    }

    public List<RequiredAttendeesBean> getRequiredAttendees() {
        return RequiredAttendees;
    }

    public void setRequiredAttendees(List<RequiredAttendeesBean> RequiredAttendees) {
        this.RequiredAttendees = RequiredAttendees;
    }

    public List<?> getOptionalAttendees() {
        return OptionalAttendees;
    }

    public void setOptionalAttendees(List<?> OptionalAttendees) {
        this.OptionalAttendees = OptionalAttendees;
    }

    public List<ResourcesBean> getResources() {
        return Resources;
    }

    public void setResources(List<ResourcesBean> Resources) {
        this.Resources = Resources;
    }

    public static class IdBean {
        /**
         * UniqueId : AAMkAGE3ODVjZDNjLWMwYzItNDdiYi04YTJkLTZjNzYwMzVjYjY5ZQBGAAAAAABl5oh+UZJcQ6BFhq07rC/ABwCjfoe+7F0xTaTl71gGBgwzAAAAEQe5AACjfoe+7F0xTaTl71gGBgwzAAAAEgw5AAA=
         * ChangeKey : DwAAABYAAACjfoe+7F0xTaTl71gGBgwzAAAAEyaL
         */

        private String UniqueId;
        private String ChangeKey;

        public String getUniqueId() {
            return UniqueId;
        }

        public void setUniqueId(String UniqueId) {
            this.UniqueId = UniqueId;
        }

        public String getChangeKey() {
            return ChangeKey;
        }

        public void setChangeKey(String ChangeKey) {
            this.ChangeKey = ChangeKey;
        }
    }

    public static class CalendarIdBean {
        /**
         * UniqueId : AAMkAGFhZmEyOGQxLWQwNzQtNDk4Yy1iYTU5LWM3ZmU0ZDNiODAxNQBGAAAAAADCxZciDUbqSZpNgcWgVNZXBwDueoltASkpR60aWx8ZQ2BPAAAAYiToAADMRnUI48sXTrKToiB5tITSAAAMx4bmAAA=
         * ChangeKey : DwAAABYAAADMRnUI48sXTrKToiB5tITSAAAMwkDZ
         */

        private String UniqueId;
        private String ChangeKey;

        public String getUniqueId() {
            return UniqueId;
        }

        public void setUniqueId(String UniqueId) {
            this.UniqueId = UniqueId;
        }

        public String getChangeKey() {
            return ChangeKey;
        }

        public void setChangeKey(String ChangeKey) {
            this.ChangeKey = ChangeKey;
        }
    }

    public static class MeetingsBean {
        /**
         * Id : 5ec333db42000842ec80f616
         * Room : Room 01
         * Project : Room1
         * Status : 2
         * Email : test@gmail.com
         * Appointment : {"Id":{"UniqueId":"AAMkAGE3ODVjZDNjLWMwYzItNDdiYi04YTJkLTZjNzYwMzVjYjY5ZQBGAAAAAABl5oh+UZJcQ6BFhq07rC/ABwCjfoe+7F0xTaTl71gGBgwzAAAAEQe5AACjfoe+7F0xTaTl71gGBgwzAAAAEgw5AAA=","ChangeKey":null},"Location":"Room 01","Subject":"Test meeting 01","Start":"2020-05-26T08:30:00Z","End":"2020-05-26T09:30:00Z"}
         */

        private String Id;
        private String Room;
        private String Project;
        private int Status;
        private String Email;
        private AppointmentBean Appointment;

        public String getId() {
            return Id;
        }

        public void setId(String Id) {
            this.Id = Id;
        }

        public String getRoom() {
            return Room;
        }

        public void setRoom(String Room) {
            this.Room = Room;
        }

        public String getProject() {
            return Project;
        }

        public void setProject(String Project) {
            this.Project = Project;
        }

        public int getStatus() {
            return Status;
        }

        public void setStatus(int Status) {
            this.Status = Status;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public AppointmentBean getAppointment() {
            return Appointment;
        }

        public void setAppointment(AppointmentBean Appointment) {
            this.Appointment = Appointment;
        }

        public static class AppointmentBean {
            /**
             * Id : {"UniqueId":"AAMkAGE3ODVjZDNjLWMwYzItNDdiYi04YTJkLTZjNzYwMzVjYjY5ZQBGAAAAAABl5oh+UZJcQ6BFhq07rC/ABwCjfoe+7F0xTaTl71gGBgwzAAAAEQe5AACjfoe+7F0xTaTl71gGBgwzAAAAEgw5AAA=","ChangeKey":null}
             * Location : Room 01
             * Subject : Test meeting 01
             * Start : 2020-05-26T08:30:00Z
             * End : 2020-05-26T09:30:00Z
             */

            private IdBeanX Id;
            private String Location;
            private String Subject;
            private String Start;
            private String End;

            public IdBeanX getId() {
                return Id;
            }

            public void setId(IdBeanX Id) {
                this.Id = Id;
            }

            public String getLocation() {
                return Location;
            }

            public void setLocation(String Location) {
                this.Location = Location;
            }

            public String getSubject() {
                return Subject;
            }

            public void setSubject(String Subject) {
                this.Subject = Subject;
            }

            public String getStart() {
                return Start;
            }

            public void setStart(String Start) {
                this.Start = Start;
            }

            public String getEnd() {
                return End;
            }

            public void setEnd(String End) {
                this.End = End;
            }

            public static class IdBeanX {
                /**
                 * UniqueId : AAMkAGE3ODVjZDNjLWMwYzItNDdiYi04YTJkLTZjNzYwMzVjYjY5ZQBGAAAAAABl5oh+UZJcQ6BFhq07rC/ABwCjfoe+7F0xTaTl71gGBgwzAAAAEQe5AACjfoe+7F0xTaTl71gGBgwzAAAAEgw5AAA=
                 * ChangeKey : null
                 */

                private String UniqueId;
                private Object ChangeKey;

                public String getUniqueId() {
                    return UniqueId;
                }

                public void setUniqueId(String UniqueId) {
                    this.UniqueId = UniqueId;
                }

                public Object getChangeKey() {
                    return ChangeKey;
                }

                public void setChangeKey(Object ChangeKey) {
                    this.ChangeKey = ChangeKey;
                }
            }
        }
    }

    public static class RequiredAttendeesBean {
        /**
         * Name : test1@gmail.com
         * Address : test1@gmail.com
         * RoutingType : SMTP
         * MailboxType : OneOff
         * _id : null
         */

        private String Name;
        private String Address;
        private String RoutingType;
        private String MailboxType;
        private Object _id;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public String getRoutingType() {
            return RoutingType;
        }

        public void setRoutingType(String RoutingType) {
            this.RoutingType = RoutingType;
        }

        public String getMailboxType() {
            return MailboxType;
        }

        public void setMailboxType(String MailboxType) {
            this.MailboxType = MailboxType;
        }

        public Object get_id() {
            return _id;
        }

        public void set_id(Object _id) {
            this._id = _id;
        }
    }

    public static class ResourcesBean {
        /**
         * Name : Room 01
         * Address : room01@gmail.com
         * RoutingType : null
         * MailboxType : null
         * _id : null
         */

        private String Name;
        private String Address;
        private Object RoutingType;
        private Object MailboxType;
        private Object _id;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public Object getRoutingType() {
            return RoutingType;
        }

        public void setRoutingType(Object RoutingType) {
            this.RoutingType = RoutingType;
        }

        public Object getMailboxType() {
            return MailboxType;
        }

        public void setMailboxType(Object MailboxType) {
            this.MailboxType = MailboxType;
        }

        public Object get_id() {
            return _id;
        }

        public void set_id(Object _id) {
            this._id = _id;
        }
    }
}
