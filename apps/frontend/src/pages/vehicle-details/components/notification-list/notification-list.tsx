import { useMemo, useState } from "react";
import NotificationDto from "../../../../api/dto/notification-dto";
import NotificationListItem from "../notification-list-item/notification-list-item";

import "./notification-list.css";

type NotificationListProps = {
  notifications: NotificationDto[];
};

const NOTIFICATIONS_TO_RENDER = 10;

const NotificationList = ({ notifications }: NotificationListProps) => {
  const [numOfRenderedNotifications, setNumOfRenderedNotifications] =
    useState<number>(NOTIFICATIONS_TO_RENDER);

  const notificationToRender = useMemo(
    () => notifications.slice(0, numOfRenderedNotifications),
    [notifications, numOfRenderedNotifications]
  );

  const onShowMoreClick = () =>
    setNumOfRenderedNotifications((prev) => prev + NOTIFICATIONS_TO_RENDER);

  return (
    <div className="notification-list">
      {notificationToRender.map((notification) => (
        <NotificationListItem
          notification={notification}
          key={notification.id}
        />
      ))}
      <button className="show-more-button" onClick={onShowMoreClick}>
        Show more
      </button>
    </div>
  );
};

export default NotificationList;
