import client from "./client/client";

const getVehicles = async () => {
  const response = await client.get("/vehicles");

  return response.data;
};

export default getVehicles;
