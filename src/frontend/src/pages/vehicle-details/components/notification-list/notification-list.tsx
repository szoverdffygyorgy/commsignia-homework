import NotificationDto from "../../../../api/dto/notification-dto";
import NotificationListItem from "../notification-list-item/notification-list-item";

type NotificationListProps = {
  notifications: NotificationDto[];
};

const NotificationList = ({ notifications }: NotificationListProps) => {
  return (
    <div className="notification-list">
      {notifications.map((notification) => (
        <NotificationListItem
          notification={notification}
          key={notification.id}
        />
      ))}
    </div>
  );
};

export default NotificationList;
