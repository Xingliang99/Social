CREATE TABLE SocialUsers (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    Username VARCHAR(50) NOT NULL,
    Email VARCHAR(100),
    PasswordHash VARCHAR(255) NOT NULL,
    ProfilePictureURL VARCHAR(255),
    Bio TEXT,
    CreationDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE SocialPosts (
    PostID INT AUTO_INCREMENT PRIMARY KEY,
    UserID INT,
    Content TEXT NOT NULL,
    ImageURL VARCHAR(255),
    PostDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (UserID) REFERENCES SocialUsers(UserID)
);

CREATE TABLE SocialComments (
    CommentID INT AUTO_INCREMENT PRIMARY KEY,
    PostID INT,
    UserID INT,
    Comment TEXT NOT NULL,
    CommentDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (PostID) REFERENCES SocialPosts(PostID),
    FOREIGN KEY (UserID) REFERENCES SocialUsers(UserID)
);

CREATE TABLE SocialFollows (
    FollowID INT AUTO_INCREMENT PRIMARY KEY,
    FollowerID INT,
    FollowingID INT,
    FollowDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (FollowerID) REFERENCES SocialUsers(UserID),
    FOREIGN KEY (FollowingID) REFERENCES SocialUsers(UserID)
);

CREATE TABLE SocialLikes (
    LikeID INT AUTO_INCREMENT PRIMARY KEY,
    PostID INT,
    UserID INT,
    LikeDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (PostID) REFERENCES SocialPosts(PostID),
    FOREIGN KEY (UserID) REFERENCES SocialUsers(UserID)
);