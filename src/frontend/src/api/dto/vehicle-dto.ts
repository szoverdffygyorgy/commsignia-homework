import NotificationDto from "./notification-dto";

type VehicleDto = {
  id: string;
  latitude: number;
  longitude: number;
  notifications: NotificationDto[];
  createdAt: string;
};

export default VehicleDto;
