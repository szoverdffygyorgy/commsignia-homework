import NotificationDto from "../../../../api/dto/notification-dto";
import dateFormat from "../../../../utils/date-format";

import "./notification-list-item.css";

type NotificationListItemProps = {
  notification: NotificationDto;
};

const NotificationListItem = ({ notification }: NotificationListItemProps) => {
  return (
    <div className="notification-list-item">
      <div>{dateFormat.format(new Date(notification.createdAt))}</div>
      <div>{notification.message}</div>
    </div>
  );
};

export default NotificationListItem;
