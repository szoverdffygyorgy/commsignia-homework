import client from "./client/client";
import GetVehiclesDto from "./dto/get-vehicles-dto";

const getVehicles = async () => {
  const response = await client.get<GetVehiclesDto>("/vehicles");

  return response.data;
};

export default getVehicles;
