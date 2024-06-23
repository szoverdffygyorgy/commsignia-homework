import NotificationDto from "./notification-dto";

type VehicleDetailsDto = {
  id: string;
  latitude: number;
  longitude: number;
  notifications: NotificationDto[];
  createdAt: string;
};

export default VehicleDetailsDto;
