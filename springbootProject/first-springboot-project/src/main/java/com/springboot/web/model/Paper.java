package com.springboot.web.model;

public class Paper {

	    private int id;
	    private String user;
	    private String author;
	    private String topic;
	    private String branch;
	    private String desc;
	    private String path;
	    private String status;


	    public Paper(int id, String user, String author, String topic,
				String branch, String desc, String path,
				String status) {
			super();
			this.id = id;
			this.user = user;
			this.author = author;
			this.topic = topic;
			this.branch = branch;
			this.desc = desc;
			this.path = path;
			this.status = status;
		}

	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getTopic() {
			return topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		
		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((author == null) ? 0 : author.hashCode());
			result = prime * result
					+ ((branch == null) ? 0 : branch.hashCode());
			result = prime * result + ((desc == null) ? 0 : desc.hashCode());
			result = prime * result + id;
			result = prime * result + ((path == null) ? 0 : path.hashCode());
			result = prime * result
					+ ((status == null) ? 0 : status.hashCode());
			result = prime * result + ((topic == null) ? 0 : topic.hashCode());
			result = prime * result + ((user == null) ? 0 : user.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Paper other = (Paper) obj;
			if (author == null) {
				if (other.author != null)
					return false;
			} else if (!author.equals(other.author))
				return false;
			if (branch == null) {
				if (other.branch != null)
					return false;
			} else if (!branch.equals(other.branch))
				return false;
			if (desc == null) {
				if (other.desc != null)
					return false;
			} else if (!desc.equals(other.desc))
				return false;
			if (id != other.id)
				return false;
			if (path == null) {
				if (other.path != null)
					return false;
			} else if (!path.equals(other.path))
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			if (topic == null) {
				if (other.topic != null)
					return false;
			} else if (!topic.equals(other.topic))
				return false;
			if (user == null) {
				if (other.user != null)
					return false;
			} else if (!user.equals(other.user))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "confPaper [id=" + id + ", user=" + user + ", author="
					+ author + ", topic=" + topic + ", branch=" + branch
					+ ", desc=" + desc + ", path=" + path + ", status="
					+ status + "]";
		}



	}
